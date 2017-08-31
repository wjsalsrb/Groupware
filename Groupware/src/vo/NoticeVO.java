package vo;

import java.util.Date;

public class NoticeVO {
	private int noticeNo = 0;
	private String noticeTitle = "";
	private String noticeContents = "";
	private String memberId = "";
	private int noticeCount = 0;
	private Date noticeDate = null;
	
	public int getNoticeNo() {
		return noticeNo;
	}
	public NoticeVO setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
		return this;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public NoticeVO setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
		return this;
	}
	public String getNoticeContents() {
		return noticeContents;
	}
	public NoticeVO setNoticeContents(String noticeContents) {
		this.noticeContents = noticeContents;
		return this;
	}
	public String getMemberId() {
		return memberId;
	}
	public NoticeVO setMemberId(String memberId) {
		this.memberId = memberId;
		return this;
	}
	public int getNoticeCount() {
		return noticeCount;
	}
	public NoticeVO setNoticeCount(int noticeCount) {
		this.noticeCount = noticeCount;
		return this;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public NoticeVO setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
		return this;
	}
	
	
}
