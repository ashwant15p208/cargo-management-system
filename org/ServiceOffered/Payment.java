package org.ServiceOffered;

public class Payment {
	private String PaymentNumber;
	private String PaymentMethod;
	private String PaymentStatus;

	public String getPaymentNumber() {
		return PaymentNumber;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public String getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentNumber(String paymentNumber) {
		PaymentNumber = paymentNumber;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}
}
