package com.app.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {
	
	@Override
	public String toString() {
		return "Book [id=" + id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	private int id;
	private String bookName;
	private String authorName;
}
