
		import java.util.*;
		public class Main {

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the player name");
				String a = s.nextLine();
				System.out.println("Enter the player age");
				int b = Integer.parseInt(s.nextLine());
				try{
				if(b<19)
					throw new CustomException("InvalidAgeRangeException");
				
				System.out.println("Player name : "+a);
				System.out.println("Player age : "+b);
				}
				catch(CustomException e)
				{
					System.out.println(e.getClass().getCanonicalName()+": "+e.getMessage());
				}
			}

		}