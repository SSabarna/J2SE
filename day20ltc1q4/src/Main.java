import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter player name ");
				String a = s.nextLine();
				System.out.println("Enter player country");
				String b = s.nextLine();
				System.out.println("Enter the Cap number");
				String c = s.nextLine();
				System.out.println("Enter the number of test appearnace");
				int d = Integer.parseInt(s.nextLine());
				System.out.println("Enter the number of ODI appearnace");
				int e = Integer.parseInt(s.nextLine());
				InternationalPlayer ip = new InternationalPlayer(a,b,c,d,e);
				ip.displayDetails();
			}

		}
