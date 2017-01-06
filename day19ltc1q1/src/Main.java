import java.util.Scanner;

class Main
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("1. Rectangle\n2. Square\n3. Circle\nArea Calculator --- Choose your shape\n");
		int n = s.nextInt();
		switch(n)
		{
		case 1:
		{
			System.out.println("Enter length and breadth:");
			int a = s.nextInt();
			int b = s.nextInt();
			Rectangle r = new Rectangle(a,b);
			System.out.printf("Area of Rectangle is:%.2f",r.calculateArea());
			break;
		}
		case 2:
		{
			System.out.println("Enter side:");
			int a = s.nextInt();
			Square sq = new Square(a);
			System.out.printf("Area of Square is:%.2f",sq.calculateArea());
			break;
		}
		case 3:
		{
			System.out.println("Enter Radius:");
			int a = s.nextInt();
			Circle c = new Circle(a);
			System.out.printf("Area of Circle is:%.2f",c.calculateArea());
		}
		}
	}
}