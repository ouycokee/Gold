package entity;

import java.sql.Timestamp;

public class Reply {
	private int replyId;
    private int reviewId;
    private int adminId;
    private String replyContent;
    private Timestamp replyCreateTime;
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Timestamp getReplyCreateTime() {
		return replyCreateTime;
	}
	public void setReplyCreateTime(Timestamp replyCreateTime) {
		this.replyCreateTime = replyCreateTime;
	}
	@Override
	public String toString() {
		return "Reply [replyId=" + replyId + ", reviewId=" + reviewId + ", adminId=" + adminId + ", replyContent="
				+ replyContent + ", replyCreateTime=" + replyCreateTime + "]";
	}
	public Reply(int replyId, int reviewId, int adminId, String replyContent, Timestamp replyCreateTime) {
		super();
		this.replyId = replyId;
		this.reviewId = reviewId;
		this.adminId = adminId;
		this.replyContent = replyContent;
		this.replyCreateTime = replyCreateTime;
	}
	public Reply() {
		super();
	}
    
    
}
