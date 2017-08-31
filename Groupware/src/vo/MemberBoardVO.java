package vo;

public class MemberBoardVO {
	private int boardNo = 0;
	private String memberId = "";
	
	public int getBoardNo() {
		return boardNo;
	}
	public MemberBoardVO setBoardNo(int boardNo) {
		this.boardNo = boardNo;
		return this;
	}
	public String getMemberId() {
		return memberId;
	}
	public MemberBoardVO setMemberId(String memberId) {
		this.memberId = memberId;
		return this;
	}
	
	
}
