package com.javaExample.io;

import com.google.gson.annotations.Expose;

public class JBook {
	@Expose
	private String title;
    private String author;
    private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "SerialazationExample [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
    


}
