package com.javatpoint.beans;

public class Chat {
	String history;
	String message;
	String product;

	public Chat() {
	}

	public Chat(String hist, String mes,String prd) {
		this.history = hist;
		this.message = mes;
		this.product = prd;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

}
