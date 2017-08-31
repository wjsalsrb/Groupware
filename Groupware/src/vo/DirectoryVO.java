package vo;

public class DirectoryVO {
	private int directoryNo = 0;
	private String memberId = "";
	private String directoryName = "";
	private String directoryTel = "";
	private int groupNo = 0;
	
	public int getDirectoryNo() {
		return directoryNo;
	}
	public DirectoryVO setDirectoryNo(int directoryNo) {
		this.directoryNo = directoryNo;
		return this;
	}
	public String getMemberId() {
		return memberId;
	}
	public DirectoryVO setMemberId(String memberId) {
		this.memberId = memberId;
		return this;
	}
	public String getDirectoryName() {
		return directoryName;
	}
	public DirectoryVO setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
		return this;
	}
	public String getDirectoryTel() {
		return directoryTel;
	}
	public DirectoryVO setDirectoryTel(String directoryTel) {
		this.directoryTel = directoryTel;
		return this;
	}
	public int getGroupNo() {
		return groupNo;
	}
	public DirectoryVO setGroupNo(int groupNo) {
		this.groupNo = groupNo;
		return this;
	}
	
	
}
