package org.ServiceOffered;

public class Service {
	private String ServiceName;
	private String ServiceId;
	private String ServiceNumber;
	private String ServiceType;

	public String getServiceName() {
		return ServiceName;
	}

	public String getServiceId() {
		return ServiceId;
	}

	public String getServiceNumber() {
		return ServiceNumber;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public void setServiceName(String serviceName) {
		ServiceName = serviceName;
	}

	public void setServiceId(String serviceId) {
		ServiceId = serviceId;
	}

	public void setServiceNumber(String serviceNumber) {
		ServiceNumber = serviceNumber;
	}

	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}

}
