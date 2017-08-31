package vo;

public class BandVO {
	private int groupNo = 0;
	private String memberId = "";
	private String groupName = "";
	
	public int getGroupNo() {
		return groupNo;
	}
	public BandVO setGroupNo(int groupNo) {
		this.groupNo = groupNo;
		return this;
	}
	public String getMemberId() {
		return memberId;
	}
	public BandVO setMemberId(String memberId) {
		this.memberId = memberId;
		return this;
	}
	public String getGroupName() {
		return groupName;
	}
	public BandVO setGroupName(String groupName) {
		this.groupName = groupName;
		return this;
	}
	
	
}
