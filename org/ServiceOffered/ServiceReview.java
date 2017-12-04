package org.ServiceOffered;

public class ServiceReview {
	private String ServiceGrade;
	private String ServiceReview;

	public String getServiceGrade() {
		return ServiceGrade;
	}

	public String getServiceReview() {
		return ServiceReview;
	}

	public String getServiceId() {
		return ServiceId;
	}

	public void setServiceGrade(String serviceGrade) {
		ServiceGrade = serviceGrade;
	}

	public void setServiceReview(String serviceReview) {
		ServiceReview = serviceReview;
	}

	public void setServiceId(String serviceId) {
		ServiceId = serviceId;
	}

	private String ServiceId;

}
