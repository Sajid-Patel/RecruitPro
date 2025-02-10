package com.campus_recruitment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.campus_recruitment.enums.ApplicationStatus;

@Entity
@Table(name = "job_application")
public class JobApplication {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	private long id;

	@Column(name = "student_Id", nullable = false)
	private long studentId;

	@Column(name = "job_Posting", nullable = false)
	private long jobPosting;

	@Column(name = "status", nullable = false)
	private String status = ApplicationStatus.APPLIED.getValue();

	public JobApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobApplication(long id, long studentId, long jobPosting, String status) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.jobPosting = jobPosting;
		this.status = status;
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

	public long getJobPosting() {
		return jobPosting;
	}

	public void setJobPosting(long jobPosting) {
		this.jobPosting = jobPosting;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "JobApplication [id=" + id + ", studentId=" + studentId + ", jobPosting=" + jobPosting + ", status="
				+ status + "]";
	}

}
