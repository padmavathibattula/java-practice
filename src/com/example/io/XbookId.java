package com.example.io;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="book id")
public class XbookId {
	private String id;
	private String title;
	private String author;
	private String publicationYear;
	private String genre;
	private XAvailability availability;
	

	public XbookId(String id, String title, String author, String publicationYear, String genre,
			XAvailability availability) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.genre = genre;
		this.availability = availability;
	}
	public XbookId() {
		this.availability = new XAvailability(); // Initialize Availability object
	}
	@XmlAttribute(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@XmlElement(name="title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement(name="author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@XmlElement(name="publication_year")
	public String getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}
	@XmlElement(name="genre")
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	@XmlElement(name="availability")
	public XAvailability getAvailability() {
		return availability;
	}

	public void setAvailability(XAvailability availability) {
		this.availability = availability;
	}
	
	

}
