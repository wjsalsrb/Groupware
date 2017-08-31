package vo;

public class ProjectMemberVO {
	private int projectNO = 0;
	private String memberId = "";
	
	public int getProjectNO() {
		return projectNO;
	}
	public ProjectMemberVO setProjectNO(int projectNO) {
		this.projectNO = projectNO;
		return this;
	}
	public String getMemberId() {
		return memberId;
	}
	public ProjectMemberVO setMemberId(String memberId) {
		this.memberId = memberId;
		return this;
	}
	
	
}
