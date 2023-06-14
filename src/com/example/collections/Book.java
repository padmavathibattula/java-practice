package com.example.collections;

public class Book {
	private String title;
	private String author;
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		Book book= (Book) obj;
		if(this.title==book.title && book.equals(book.author)) {
			return true;
		}
		else
			return false;
	}
	@Override
	public int hashCode() {
		int result = this.title.hashCode();
		return result;
	}
	public static void main(String[] args) {
		Book book1 = new Book("A Better India","Narayana murthy");
		Book book2 = new Book("A Better India","Narayana murthy");
		System.out.println(".equals():"+book1.equals(book2)+"=="+(book1==book2));
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
