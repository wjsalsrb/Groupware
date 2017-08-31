package vo;

public class MailVO {
	private int mailNo = 0;
	private String mailTitle = "";
	private String mailContents = "";
	private String mailSender = "";
	private String mailReceiver = "";
	
	public int getMailNo() {
		return mailNo;
	}
	public MailVO setMailNo(int mailNo) {
		this.mailNo = mailNo;
		return this;
	}
	public String getMailTitle() {
		return mailTitle;
	}
	public MailVO setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle;
		return this;
	}
	public String getMailContents() {
		return mailContents;
	}
	public MailVO setMailContents(String mailContents) {
		this.mailContents = mailContents;
		return this;
	}
	public String getMailSender() {
		return mailSender;
	}
	public MailVO setMailSender(String mailSender) {
		this.mailSender = mailSender;
		return this;
	}
	public String getMailReceiver() {
		return mailReceiver;
	}
	public MailVO setMailReceiver(String mailReceiver) {
		this.mailReceiver = mailReceiver;
		return this;
	}
	
	
}
