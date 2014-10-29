package mypackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

	@GeneratedValue
	@Id
	private Long isbn;
	private String author;
	private String title;
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
