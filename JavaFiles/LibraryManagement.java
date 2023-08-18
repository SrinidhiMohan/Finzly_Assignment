package assignmentJava;

public class LibraryManagement {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("HarryPotter");
		b1.setItemID(1001);
		b1.setAuthor("JKR");
		b1.displayInfo();
		DVD d1 = new DVD();
		d1.setTitle("La La land");
		d1.setItemID(1002);
		d1.setDuration(145);
		d1.displayInfo();
		StudentMember s1 = new StudentMember(2001, "Srindhi");
		s1.borrowItem(b1);
		FacultyMember f1 = new FacultyMember(3001, "Saishree");
		f1.borrowItem(d1);

	}
}

class LibraryItem {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	private int itemID;

	void displayInfo() {
		System.out.println(getTitle() + " " + getItemID());
	}
}

class Book extends LibraryItem {
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	void displayInfo() {
		System.out.println(getTitle() + " | " + getItemID() + " | " + author);
	}
}

class DVD extends LibraryItem {
	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	void displayInfo() {
		System.out.println(getTitle() + " | " + getItemID() + " | " + duration + " mins");
	}
}

abstract class LibraryMember {
	int memberID;
	String name;

	abstract void borrowItem(LibraryItem item);
}

class StudentMember extends LibraryMember {
	StudentMember(int memberID, String name) {
		this.memberID = memberID;
		this.name = name;
	}

	void borrowItem(LibraryItem item) {
		System.out.println(item.getTitle() + " is borrowed by " + name + " - " + memberID);
	}
}

class FacultyMember extends LibraryMember {
	FacultyMember(int memberID, String name) {
		this.memberID = memberID;
		this.name = name;
	}

	void borrowItem(LibraryItem item) {
		System.out.println(item.getTitle() + " is borrowed by " + name + " - " + memberID);
	}
}

interface Reservable {
	void reserveItem(LibraryItem item);
}
