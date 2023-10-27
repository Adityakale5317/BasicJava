package Assignment_5_Book;
/*Problem Statement:
Given a Book class and a Solution class, write a MyBook class that does the following:
	1.Inherits from Book
	2.Has a parameterized constructor taking these 3 parameters:
	 string title
	 string author
	 int price
	3.Implements the Book class’ abstract display() method so it prints these  lines:
	Title: , a space, and then the current instance’s title.
	Author:, a space, and then the current instance’s author.
	Price:, a space, and then the current instance’s price.
	 */
	abstract class Book{
		String title;
		String author;
		
		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		abstract void display();
	}
	
	class MyBook extends Book{
		int price;
		
		public MyBook(String title, String author, int price) {
			super(title, author);
			this.price = price;
		}
		
		//override
		public void display() {
			 System.out.println("Title: " + title);
		     System.out.println("Author: " + author);
		     System.out.println("Price: " + price);
		
		}
	}

	public class Assignement_five_BookTask {

		public static void main(String[] args) {
		
			MyBook book = new MyBook("The feast of roses", "Indu Sundaresan", 475);
			book.display();
	}

}
