
public class Ebook extends Book{

	private String diskType;
	private double size;
	
	public Ebook() {
		
	}


public Ebook(String name, String author, String publication, double price,String diskType,double size) {
		super(name, author, publication, price);
		this.diskType = diskType;
		this.size = size;
	}




public String getDiskType() {
		return diskType;
	}




	public void setDiskType(String diskType) {
		this.diskType = diskType;
	}




	public double getSize() {
		return size;
	}




	public void setSize(double size) {
		this.size = size;
	}




void displayDetails()
{
	System.out.println("EBook  Details");
	System.out.println("Name of the book :"+name+"\nAuthor:"+author);
	System.out.printf("Price:%.2f",price);
			System.out.println("\nPublication:"+publication+"\nDisk type:"+diskType);
	System.out.printf("Size:%.2f",size);
}


}


