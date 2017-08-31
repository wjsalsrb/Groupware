package vo;

public class MemberVO {
	private String memberId = "";
	private int memberNo = 0;
	private String memberName = "";
	private String memberPwd = "";
	private String memberTel1 = "";
	private String membertel2 = "";
	private char memberGender = ' ';
	private int jobNo = 0;
	private int deptNo = 0;

	public String getMemberId() {
		return memberId;
	}

	public MemberVO setMemberId(String memberId) {
		this.memberId = memberId;
		return this;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public MemberVO setMemberNo(int memberNo) {
		this.memberNo = memberNo;
		return this;
	}

	public String getMemberName() {
		return memberName;
	}

	public MemberVO setMemberName(String memberName) {
		this.memberName = memberName;
		return this;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public MemberVO setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
		return this;
	}

	public String getMemberTel1() {
		return memberTel1;
	}

	public MemberVO setMemberTel1(String memberTel1) {
		this.memberTel1 = memberTel1;
		return this;
	}

	public String getMembertel2() {
		return membertel2;
	}

	public MemberVO setMembertel2(String membertel2) {
		this.membertel2 = membertel2;
		return this;
	}

	public char getMemberGender() {
		return memberGender;
	}

	public MemberVO setMemberGender(char memberGender) {
		this.memberGender = memberGender;
		return this;
	}

	public int getJobNo() {
		return jobNo;
	}

	public MemberVO setJobNo(int jobNo) {
		this.jobNo = jobNo;
		return this;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public MemberVO setDeptNo(int deptNo) {
		this.deptNo = deptNo;
		return this;
	}
}
