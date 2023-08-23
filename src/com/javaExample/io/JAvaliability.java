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
	public void setStatus(String status, String string) {
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
	public void setBorrower(String borrower, String string) {
		this.borrower = borrower;
	}
	public void setDuedate(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	@Override
	public String toString() {
		return "JAvaliability [status=" + status + ", dueDate=" + dueDate + ", borrower=" + borrower + ", getStatus()="
				+ getStatus() + ", getDueDate()=" + getDueDate() + ", getBorrower()=" + getBorrower() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
    
}
