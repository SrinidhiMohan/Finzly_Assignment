package hibernateTask;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booklist {
	
	int isbn;
	String title;
	String author;
	String year;
	
	@Id
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Booklist [isbn=" + isbn + ", title=" + title + ", author=" + author + ", year=" + year + "]";
	}

}
