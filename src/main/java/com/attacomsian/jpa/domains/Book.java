package com.attacomsian.jpa.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	@Column(unique = true)
	private String isbn;

	/*
	 * public Book() { }
	 * 
	 * public Book(String title, String isbn) { this.title = title; this.isbn =
	 * isbn; }
	 * 
	 * public void setTitle(String string) { // TODO Auto-generated method stub
	 * 
	 * } // getters and setters removed for brevity
	 */
	public Book() {
		super();
	}

	public Book(/*Long id*/ String title, String isbn) {
		super();
//		this.id = id;
		this.title = title;
		this.isbn = isbn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + "]";
	}

}
