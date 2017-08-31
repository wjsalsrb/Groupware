package vo;

import java.util.Date;

public class NoteVO {
	private int noteNo = 0;
	private String memberId = "";
	private String noteContents = "";
	private Date noteDate = null;
	public int getNoteNo() {
		return noteNo;
	}
	public NoteVO setNoteNo(int noteNo) {
		this.noteNo = noteNo;
		return this;
	}
	public String getMemberId() {
		return memberId;
	}
	public NoteVO setMemberId(String memberId) {
		this.memberId = memberId;
		return this;
	}
	public String getNoteContents() {
		return noteContents;
	}
	public NoteVO setNoteContents(String noteContents) {
		this.noteContents = noteContents;
		return this;
	}
	public Date getNoteDate() {
		return noteDate;
	}
	public NoteVO setNoteDate(Date noteDate) {
		this.noteDate = noteDate;
		return this;
	}
	
		
}
