import java.util.*;
public class Main {

	public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException {
		try{
			System.out.println("Trying to invoke a no-argument constructor (that is not available) using newInstance method");
			Scanner s = new Scanner(System.in);
			Class c = Class.forName("Player");
			Player p =(Player)c.newInstance();
			//throw new InstantiationException();
			
			
		}
		catch(InstantiationException e)
		{
			System.out.println("Exception Occured : "+e.getClass().getCanonicalName()); 
			
		} 
		finally{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter name of the player");
			String a = s.nextLine();
			System.out.println("Enter country of the player");
			String b = s.nextLine();
			System.out.println("Enter skillset of the player");
			String d = s.nextLine();
			Player p = new Player(a,b,d);
			p.display();
		
		}
	}

}
