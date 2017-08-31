package vo;

public class CommentsVO {
	private int commentNo = 0;
	private int boardNo = 0;
	private String memberId = "";
	private String commentContents = "";
	
	public int getCommentNo() {
		return commentNo;
	}
	public CommentsVO setCommentNo(int commentNo) {
		this.commentNo = commentNo;
		return this;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public CommentsVO setBoardNo(int boardNo) {
		this.boardNo = boardNo;
		return this;
	}
	public String getMemberId() {
		return memberId;
	}
	public CommentsVO setMemberId(String memberId) {
		this.memberId = memberId;
		return this;
	}
	public String getCommentContents() {
		return commentContents;
	}
	public CommentsVO setCommentContents(String commentContents) {
		this.commentContents = commentContents;
		return this;
	}
	
	
}
