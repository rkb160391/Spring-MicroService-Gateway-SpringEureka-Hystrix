package com.rkb.api.model;

public class OutputResponse {

	private Object order;
	private Object payment;
	private String status;
	private String message;

	public Object getOrder() {
		return order;
	}

	public void setOrder(Object order) {
		this.order = order;
	}

	public Object getPayment() {
		return payment;
	}

	public void setPayment(Object payment) {
		this.payment = payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
