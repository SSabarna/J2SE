
public class Book {
    

protected String name,author,publication;
protected double price;



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getPublication() {
	return publication;
}

public void setPublication(String publication) {
	this.publication = publication;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Book(String name, String author, String publication, double price) {
	super();
	this.name = name;
	this.author = author;
	this.publication = publication;
	this.price = price;
}

public Book() {
	
}


void displayDetails()
{
	System.out.println("Printed Book Details");
	System.out.println("Name of the book :"+name+"\nAuthor"+author);
	System.out.printf("Price:%.2f\n",price);
			System.out.println("Publication:"+publication);
      
}
}


