
public class PrintedBook extends Book{
    
private int numOfPages;
private String bindingType,paperType;



public int getNumOfPages() {
	return numOfPages;
}



public void setNumOfPages(int numOfPages) {
	this.numOfPages = numOfPages;
}



public String getBindingType() {
	return bindingType;
}



public void setBindingType(String bindingType) {
	this.bindingType = bindingType;
}



public String getPaperType() {
	return paperType;
}



public void setPaperType(String paperType) {
	this.paperType = paperType;
}

public PrintedBook() {
	
}

public PrintedBook(String name, String author, String publication,
		double price, int numOfPages, String bindingType, String paperType) {
	super(name, author, publication, price);
	this.numOfPages = numOfPages;
	this.bindingType = bindingType;
	this.paperType = paperType;
}



void displayDetails()
{


System.out.println("Printed Book Details");
System.out.println("Name of the book :"+name+"\nAuthor"+author+"\nPrice:"+price+
		"\nPublication:"+publication+"\nNumber of Pages:"+numOfPages+
		"\nBinding type:"+bindingType+"\nPaper type:"+paperType);

}
}


