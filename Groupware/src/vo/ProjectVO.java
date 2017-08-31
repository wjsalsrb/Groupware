package vo;

import java.util.Date;

public class ProjectVO {
	private int projectNO = 0;
	private String projectName = "";
	private Date projectStartDate = null;
	private Date projectEndDate = null;
	private String projectPartner = "";
	private String projectDescription = "";
	
	public int getProjectNO() {
		return projectNO;
	}
	public ProjectVO setProjectNO(int projectNO) {
		this.projectNO = projectNO;
		return this;
	}
	public String getProjectName() {
		return projectName;
	}
	public ProjectVO setProjectName(String projectName) {
		this.projectName = projectName;
		return this;
	}
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public ProjectVO setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
		return this;
	}
	public Date getProjectEndDate() {
		return projectEndDate;
	}
	public ProjectVO setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
		return this;
	}
	public String getProjectPartner() {
		return projectPartner;
	}
	public ProjectVO setProjectPartner(String projectPartner) {
		this.projectPartner = projectPartner;
		return this;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public ProjectVO setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
		return this;
	}
	
	
}
