package entity;
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
* @Description: 
* @author: 惠
* @date 2024年2月5日 下午6:05:23
*/
public class pageEntity extends SimpleTagSupport {
	private String controller;// Web组件名
	private int curpage;// 当前页
	private int pagesize;// 页大小
	private int total;// 总记录数
	private String where = "";// 其他请求参数
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	public int getCurpage() {
		return curpage;
	}

	public void setCurpage(int curpage) {
		this.curpage = curpage;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public int pages() {
	    return (this.total - 1) / this.pagesize + 1;
	}

	@Override
	public void doTag() throws JspException, IOException {
	    String url = "<a href='%s?curpage=%d&pagesize=%d&where=%s'>%s</a>";
	    // 第一页
	    String first = String.format(url, this.controller, 1, this.pagesize, this.where, "第一页");
	    // 上一页
	    String pre = null;
	    if (this.curpage == 1) {
	        pre = "<a href=javascript:alert('已经是第一页');>上一页</a>";
	    } else {
	        pre = String.format(url, this.controller, this.curpage - 1, this.pagesize, this.where, "上一页");
	    }
	    // 下一页
	    String next = null;
	    if (this.curpage == this.pages()) {
	        next = "<a href=javascript:alert('已经是最后一页');>下一页</a>";
	    } else {
	        next = String.format(url, this.controller, this.curpage + 1, this.pagesize, this.where, "下一页");
	    }

	    // 最后一页
	    String last = String.format(url, this.controller, this.pages(), this.pagesize, this.where, "最后一页");

	    String info = String.format(" 第%d页/共%d页 共%d条记录", this.curpage, this.pages(), this.total);

	    // 拼出最后的结果
	    StringBuffer sb = new StringBuffer();
	    sb.append("<div class='p'>").append(first).append(pre).append(next).append(last).append(info)
	            .append("<select onchange='jumpPage(this.value)'>");
	    String url1 = "%s?curpage=%d&pagesize=%d&where=%s";
	    for (int i = 1; i <= pages(); i++) {
	        if (i == curpage) {
	            String se = String.format(url1, this.controller, i, this.pagesize, this.where);
	            sb.append("<option value='").append(se).append("' selected>");
	            sb.append(i);
	            sb.append("</option>");
	        } else {
	            String se = String.format(url1, this.controller, i, this.pagesize, this.where);
	            sb.append("<option value='").append(se).append("'>");
	            sb.append(i);
	            sb.append("</option>");
	        }
	    }
	    sb.append("</select>");
	    sb.append("</div>");
	    // 输出
	    JspWriter out = this.getJspContext().getOut();
	    out.print(sb);
	}
}

