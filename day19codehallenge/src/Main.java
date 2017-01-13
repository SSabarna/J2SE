import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{

		String bn,an,pn;
		double p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book name");
		bn = sc.nextLine();
		System.out.println("Enter the author name");
		an = sc.nextLine();
		System.out.println("Enter the price");
		p = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the publication name");
		pn = sc.nextLine();
		
		System.out.println("Enter the type of book");
		System.out.println("1.PrintedBook\n2.EBook");
		int ch = sc.nextInt();
		sc.nextLine();
		switch (ch) {
		case 1:
			System.out.println("Enter the number of pages of the book");
			int page = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the binding type of the book");
			String bt = sc.nextLine();
			System.out.println("Enter the paper type of the book");
			String pt = sc.nextLine();
			PrintedBook pb = new PrintedBook(bn, an, pn, p, page, bt, pt);
			pb.displayDetails();
			break;
		case 2:
			System.out.println("Enter the disk type of the book");
			String dt = sc.nextLine();
			System.out.println("Enter the size of the disk");
			double size = Double.parseDouble(sc.nextLine());
			Ebook eb = new Ebook(bn, an, pn, p,dt,size);
			eb.displayDetails();
			break;
		default:
			break;
		}

	}

}
