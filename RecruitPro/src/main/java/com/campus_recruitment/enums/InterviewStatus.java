package com.campus_recruitment.enums;

public enum InterviewStatus {
	SCHEDULED("Scheduled"), COMPLETED("ICompleted"), CANCLED("Canclled");

	private final String value;

	InterviewStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
