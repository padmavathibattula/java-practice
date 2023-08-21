package com.javaExample.io;

import com.google.gson.annotations.Expose;

public class JBookId {
	@Expose
	private String id;
	private String title;
	private String author;
	private int publicationYear;
	private String genre;
	private JAvaliability availability;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public JAvaliability getAvailability() {
		return availability;
	}
	public void setAvailability(JAvaliability availability) {
		this.availability = availability;
	}
    

}
