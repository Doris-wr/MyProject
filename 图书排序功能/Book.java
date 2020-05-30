package Õº È≈≈–Ú;

public class Book implements Comparable<Book> {
	String ISBN;
	String title;
	String author;
	int price;
	int sales;
	int comments;
	public Book(String iSBN, String title, String author, int price, int sales, int comments) {
		super();
		this.ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.price = price;
		this.sales = sales;
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", comments=" + comments +
                '}';
	}
	@Override
	public int compareTo(Book o) {
		return ISBN.compareTo(o.ISBN);
	}
	
}
