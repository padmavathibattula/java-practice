package com.javaExample.io;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="availability")
public class Availability {
	private String status;
    private String dueDate;
    private String borrower;
	public Availability(String status, String dueDate, String borrower) {
		this.status = status;
		this.dueDate = dueDate;
		this.borrower = borrower;
	}
	public Availability() {
	}
	@XmlElement(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@XmlElement(name="due_date")
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	@XmlElement(name="borrower")
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	
    
}
