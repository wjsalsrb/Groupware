package vo;

public class JobVO {
	private int jobNo = 0;
	private String jobName = "";
	
	public int getJobNo() {
		return jobNo;
	}
	public JobVO setJobNo(int jobNo) {
		this.jobNo = jobNo;
		return this;
	}
	public String getJobName() {
		return jobName;
	}
	public JobVO setJobName(String jobName) {
		this.jobName = jobName;
		return this;
	}
	
	
}
