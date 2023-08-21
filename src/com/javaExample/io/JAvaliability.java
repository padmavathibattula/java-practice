package com.javaExample.io;

import com.google.gson.annotations.Expose;

public class JAvaliability {
	@Expose
	private String status;
    private String dueDate;
    private String borrower;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
    
}
