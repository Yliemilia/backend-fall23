package com.example.domain;

public class Book {
	
	private String title, author, isbn;
	private int publicationYear;
	private double price;
	
	public Book() {
		super();
	}
	
	public Book(String title, String author, int publicationYear, String isbn, double price) {
		this.title=title;
		this.author=author;
		this.publicationYear=publicationYear;
		this.isbn=isbn;
		this.price=price;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", publicationYear=" + publicationYear
				+ ", price=" + price + "]";
	}

}
