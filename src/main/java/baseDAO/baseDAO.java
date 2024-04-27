package baseDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 父类DAO，为抽象类
 * @author LiZanhong
 *
 */
public class baseDAO {
	//①连接对象
		protected Connection conn;
		//②预编译对象
		protected PreparedStatement stmt;
		//③结果集对象
		protected ResultSet rs;
		//第一个字符串：mysql驱动包的全类名
		private static final String DRIVER="com.mysql.cj.jdbc.Driver";
		//第二个字符串：mysql服务器的链接地址
		private final String url="jdbc:mysql://127.0.0.1:3306/gold?useSSL=false&serverTimezone=GMT&characterEncoding=utf-8";
		//第三个字符串：mysql服务器的用户名
		private final String user="root";
		//第四个字符串：mysql服务器的密码
		private final String pwd="123456";
		static {
			//利用静态块加载驱动（自动执行且只会执行一次，类和对象创建之前）
			try {
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e) {
				System.out.println("驱动加载失败");
				e.printStackTrace();
			}
		}
		/*
		 * 获取连接对象
		 * */
		public Connection getConn() throws SQLException {
			if(conn==null || conn.isClosed()) {
				conn=DriverManager.getConnection(url, user, pwd);
			}
			return conn;
		}
		/*
		 * 关闭连接,释放资源
		 * */
		public void closeAll() {
			//先创建的后关闭
			//独立的try catch 结构 ：可以保证任何一个对象关闭报错都不会影响其它对象的关闭
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println("结果集已被关闭...");
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println("结果集已被关闭...");
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("结果集已被关闭...");
					e.printStackTrace();
				}
			}
		}
	/**
	 * 获取连接对象
	 * @return
	 */
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gold?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8", "root", "123456");
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 释放资源 
	 */
	public void close(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 释放资源 
	 * @param stmt
	 * @param conn
	 */
	public void close(Statement stmt, Connection conn) {
		this.close(null, stmt, conn);
	}
	
	/**
	 * 绑定参数
	 * @param stmt
	 * @param params  1,2,3
	 */
	public void bindParameters(PreparedStatement stmt, Object...params) {
		if(params != null) {
			for(int i = 0; i < params.length; i ++) {
				try {
					stmt.setObject(i + 1, params[i]);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
//			System.out.println(stmt);
		}
	}
	
	/**
	 * 执行insert、update和delete语句
	 * @param sql
	 * @param params
	 * @return
	 */
	public int execute(String sql, Object...params) {
		try {
			//获取连接对象
			Connection conn = this.getConnection();
			//创建语句对象
			PreparedStatement stmt = conn.prepareStatement(sql);
			//绑定参数
			this.bindParameters(stmt, params);
			System.out.println(stmt);
			//执行SQL语句
			int v = stmt.executeUpdate();
			//释放资源 
			this.close(stmt, conn);
			//返回影响的行数 
			return v;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 执行select语句，返回List集合
	 * @param <E>
	 * @param sql
	 * @param mapper
	 * @param params
	 * @return
	 */
	public <E> List<E> executeQuery(String sql, Mapper<E> mapper, 
			Object...params){
		try {
			//获取连接对象
			Connection conn = this.getConnection();
			//创建语句对象
			PreparedStatement stmt = conn.prepareStatement(sql);
			//绑定参数
			this.bindParameters(stmt, params);
			//执行SQL语句
			ResultSet rs = stmt.executeQuery();
			//将ResultSet转换成List
			List<E> list = mapper.map(rs);
			//释放资源 
			this.close(rs, stmt, conn);
			//返回影响的行数 
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 返回一个值（不是记录），适用于返回结果集为一行一列的情况
	 * @param sql
	 * @param params
	 * @return
	 */
	public Object singleObject(String sql, Object...params) {
		List<Object> list = this.executeQuery(sql, new Mapper<Object>() {
			@Override
			public List<Object> map(ResultSet rs) throws SQLException {
				List<Object> list = new ArrayList<>();
				while(rs.next()) {
					Object obj = rs.getObject(1);
					list.add(obj);
				}
				return list;
			}
		}, params);
		
		return list.get(0);//只需要List集合中的第0个元素
	}
}







