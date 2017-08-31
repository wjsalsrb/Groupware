package vo;

import java.util.Date;

public class BoardVO {
	private int boardNo = 0;
	private String boardTitle = "";
	private String boardContents = "";
	private Date boardDate = null;
	private int boardCount = 0;
	
	public int getBoardNo() {
		return boardNo;
	}
	public BoardVO setBoardNo(int boardNo) {
		this.boardNo = boardNo;
		return this;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public BoardVO setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
		return this;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public BoardVO setBoardContents(String boardContents) {
		this.boardContents = boardContents;
		return this;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public BoardVO setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
		return this;
	}
	public int getBoardCount() {
		return boardCount;
	}
	public BoardVO setBoardCount(int boardCount) {
		this.boardCount = boardCount;
		return this;
	}
	
	
}
