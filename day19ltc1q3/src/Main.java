import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		int n = Integer.parseInt(s.nextLine());
		switch(n)
		{
		case 1:
		{
			Vehicle v;
			System.out.println("Vehicle Make:");
			String a = s.nextLine();
			System.out.println("Vehicle Number:");
			String b = s.nextLine();
			System.out.println("Fuel Type:");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			int choice = Integer.parseInt(s.nextLine());
			String c="";
			if(choice==1)
				c = "Petrol";
			else if(choice==2)
				c= "Diesel";
			System.out.println("Fuel Capacity:");
			int d = Integer.parseInt(s.nextLine());
			System.out.println("Engine CC:");
			int e = Integer.parseInt(s.nextLine());
			System.out.println("Audio System:");
			String f = s.nextLine();
			System.out.println("Number of Doors:");
			int g = Integer.parseInt(s.nextLine());
			v = new FourWheeler(a,b,c,d,e,f,g);
			v.displayMake();
			v.displayBasicInfo();
			v.displayDetailInfo();
			break;
		}
		case 2:
		{
			Vehicle v;
			System.out.println("Vehicle Make:");
			String a = s.nextLine();
			System.out.println("Vehicle Number:");
			String b = s.nextLine();
			System.out.println("Fuel Type:");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			int choice = Integer.parseInt(s.nextLine());
			String c="";
			if(choice==1)
				c = "Petrol";
			else if(choice==2)
				c= "Diesel";
			System.out.println("Fuel Capacity:");
			int d = Integer.parseInt(s.nextLine());
			System.out.println("Engine CC:");
			int e = Integer.parseInt(s.nextLine());
			System.out.println("Kick Start Available(yes/no):");
			String st = s.nextLine();
			boolean f;
			if(st.equals("yes"))
				f=true;
			else
				f=false;
			v = new TwoWheeler(a,b,c,d,e,f);
			//tw.setKickStartAvailable(f);
			v.displayMake();
			v.displayBasicInfo();
			v.displayDetailInfo();
		}
		
		}
		
		
	}

}
