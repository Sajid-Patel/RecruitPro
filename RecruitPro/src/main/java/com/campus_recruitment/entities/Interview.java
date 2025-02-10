package com.campus_recruitment.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.campus_recruitment.enums.InterviewStatus;

@Entity
@Table(name = "interview")
public class Interview {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	private long id;

	@Column(name = "student_Id", nullable = false)
	private long studentId;

	@Column(name = "job_Application", nullable = false)
	private long jobApplication;

	@Column(name = "interview_Date", nullable = false)
	private Date interviewDate;

	@Column(name = "interview_Status", nullable = false)
	private String interviewStatus = InterviewStatus.SCHEDULED.getValue();

	public Interview() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interview(long id, long studentId, long jobApplication, Date interviewDate, String interviewStatus) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.jobApplication = jobApplication;
		this.interviewDate = interviewDate;
		this.interviewStatus = interviewStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public long getJobApplication() {
		return jobApplication;
	}

	public void setJobApplication(long jobApplication) {
		this.jobApplication = jobApplication;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewStatus() {
		return interviewStatus;
	}

	public void setInterviewStatus(String interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	@Override
	public String toString() {
		return "Interview [id=" + id + ", studentId=" + studentId + ", jobApplication=" + jobApplication
				+ ", interviewDate=" + interviewDate + ", interviewStatus=" + interviewStatus + "]";
	}

}
