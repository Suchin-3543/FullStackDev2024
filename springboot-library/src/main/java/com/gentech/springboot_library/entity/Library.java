package com.gentech.springboot_library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_library")

public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="book_id")
	private Long book_id;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Column(name="published_year")
	private int published_year;
	public Long getBook_id() {
		return book_id;
	}
	public void setBook_id(Long book_id) {
		this.book_id = book_id;
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
	public int getPublished_year() {
		return published_year;
	}
	public void setPublished_year(int published_year) {
		this.published_year = published_year;
	}
	public Library(Long book_id, String title, String author, int published_year) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.published_year = published_year;
	}
	public Library() {
		
	}
	
}