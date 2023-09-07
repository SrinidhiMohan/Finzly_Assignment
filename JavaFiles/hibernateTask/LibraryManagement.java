package hibernateTask;


import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class LibraryManagement {
	
	public static void main(String[] args) {
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. Add book");
			System.out.println("2. Search book");
			System.out.println("3. Update book");
			System.out.println("4. Delete book");
			System.out.println();
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Enter author name:");
				String name = scan1.nextLine();
		 

				System.out.println("Enter title name:");
				String title = scan1.nextLine();

				System.out.println("Enter isbn number:");
				int isbn = scan1.nextInt();
				
				System.out.println("Enter year:");
				String year = scan1.nextLine();
				
				System.out.println();
				
				
				LibraryManagement.addBook(name, title, isbn,year);
				
				break;
				
			case 2:
				LibraryManagement.searchBook();
				break;
			case 3:
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter author name:");
				String updateName = scan2.nextLine();
		 

				System.out.println("Enter title name:");
				String updateTitle = scan2.nextLine();

				System.out.println("Enter isbn number:");
				int updateIsbn = scan2.nextInt();
				
				System.out.println("Enter year:");
				String updateYear = scan2.nextLine();
				
				System.out.println();
				
				LibraryManagement.updateBook(updateName,updateTitle,updateIsbn,updateYear);
				break;
			case 4:
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter isbn number:");
				int deleteIsbn = scan3.nextInt();
				
				System.out.println();
				
				LibraryManagement.deleteBook(deleteIsbn);
			default:
				System.out.println("Please enter a valid choice");
					
			}
			
			}while(true);
	}
	static void addBook(String name, String title, int isbn, String year) {
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Booklist.class);
		Transaction tr = session.beginTransaction();
		Booklist bl = new Booklist();
		bl.setIsbn(isbn);
		bl.setAuthor(name);
		bl.setTitle(title);
		bl.setYear(year);
		
		session.save(bl);
		tr.commit();
		System.out.println("Details added");
		}

	static void searchBook() {
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Booklist.class);
		Transaction tr = session.beginTransaction();
		
		// a. Search for books published within a certain range of years
		//criteria.add(Restrictions.ge("year", "2000"));
		
		// b. Search for books written by a specific author.
		//criteria.add(Restrictions.like("author","%linda%"));
		
		//c. Search for books with a specific title or containing specific keywords in the title.
		//criteria.add(Restrictions.like("title","%harry%"));
		
		//d.Search for books with a specific ISBN number
		//criteria.add(Restrictions.eq("isbn",1007));
		
		 //e. Display all books currently available in the library.
		criteria.add(Restrictions.isNotNull("isbn"));
		List<Booklist> list = criteria.list();
		for (Booklist booklist : list) {
			System.out.println(booklist);
		}
	}
	
	static void updateBook(String updateName, String updateTitle, int updateIsbn, String updateYear) {
		// 3. Update the details of a book in the inventory, including title, author, publication year, and ISBN.
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Booklist.class);
		Transaction tr = session.beginTransaction();
		
		Booklist bl = new Booklist();
		bl.setIsbn(updateIsbn);
		bl.setAuthor(updateName);
		bl.setTitle(updateTitle);
		bl.setYear(updateYear);		
		session.update(bl);
		tr.commit();
		System.out.println("Details updated");
	}
	
	
	static void deleteBook(int deleteIsbn) {
		// 4. Delete a book from the inventory.
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Booklist.class);
	    Transaction tr = session.beginTransaction();
		Booklist bl = new Booklist();
		bl.setIsbn(deleteIsbn);
		
		
		session.delete(bl);
		tr.commit();
		System.out.println("Book Deleted");
	}
}


// Sample output a
//Booklist [isbn=1003, title=prey, author=linda howard, year=2002]
//Booklist [isbn=1004, title=to die for, author=linda howard, year=2009]
//Booklist [isbn=1005, title=2 states, author=chetan bhat, year=2007]
//Booklist [isbn=1006, title=three mistakes of my life, author=chetan bhagat, year=2011]
//Booklist [isbn=1007, title=wings of fire, author=apj abdul kalam, year=2005]

// Sample output b
//Booklist [isbn=1003, title=prey, author=linda howard, year=2002]
//Booklist [isbn=1004, title=to die for, author=linda howard, year=2009]

// Sample output c
//Booklist [isbn=1001, title=harry potter, author=jk rowling, year=1950]

// Sample output d
//Booklist [isbn=1007, title=wings of fire, author=apj abdul kalam, year=2005]

// Sample output e
//Booklist [isbn=1001, title=harry potter, author=jk rowling, year=1950]
//Booklist [isbn=1002, title=persuasion, author=jane austen, year=1980]
//Booklist [isbn=1003, title=prey, author=linda howard, year=2002]
//Booklist [isbn=1004, title=to die for, author=linda howard, year=2009]
//Booklist [isbn=1005, title=2 states, author=chetan bhat, year=2007]
//Booklist [isbn=1006, title=three mistakes of my life, author=chetan bhagat, year=2011]
//Booklist [isbn=1007, title=wings of fire, author=apj abdul kalam, year=2005]
//Booklist [isbn=1008, title=to kill a mocking bird, author=harper lee, year=1960]
//Booklist [isbn=1009, title=lolita, author=nabokov, year=1955]
//Booklist [isbn=1010, title=beloved, author=toni, year=1987]








