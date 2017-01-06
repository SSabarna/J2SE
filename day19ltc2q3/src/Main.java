import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Cricket Format");
		System.out.println("1.ODI");
		System.out.println("2.T20");
		System.out.println("3.Test");
		int n = s.nextInt();
		
	    switch(n)
	    {
	    case 1:
	    {
	    	Match o = new ODIMatch();
	    	System.out.println("Enter the Current Score");
			o.setCurrentScore(s.nextInt());
		    System.out.println("Enter the Current Over");
		    o.setCurrentOver(s.nextFloat());
		    System.out.println("Enter the Target Score");
		    o.setTarget(s.nextInt());
	    	
	    	/*System.out.println("Requirements:");
	    	System.out.println("Need "+(c-a)+" Runs in "+o.calculateBalls()+" balls");
	    	System.out.println("Required Run Rate - "+o.calculateRunrate());*/
	    	o.display(o.calculateRunrate(), o.calculateBalls());
	    	break;
	    }
	    case 2:
	    {
	    	Match t = new T20Match();
	    	System.out.println("Enter the Current Score");
			t.setCurrentScore(s.nextInt());
		    System.out.println("Enter the Current Over");
		    t.setCurrentOver(s.nextFloat());
		    System.out.println("Enter the Target Score");
		    t.setTarget(s.nextInt());
	    	/*System.out.println("Requirements:");
	    	System.out.println("Need "+(c-a)+" Runs in "+t.calculateBalls()+" balls");
	    	System.out.println("Required Run Rate - "+t.calculateRunrate());*/
	    	t.display(t.calculateRunrate(), t.calculateBalls());
	    	break;
	    }
	    case 3:
	    {
	    	Match te = new TestMatch();
	    	System.out.println("Enter the Current Score");
			te.setCurrentScore(s.nextInt());
		    System.out.println("Enter the Current Over");
		    te.setCurrentOver(s.nextFloat());
		    System.out.println("Enter the Target Score");
		    te.setTarget(s.nextInt());
	    	/*System.out.println("Requirements:");
	    	System.out.println("Need "+(c-a)+" Runs in "+te.calculateBalls()+" balls");
	    	System.out.println("Required Run Rate - "+te.calculateRunrate());*/
	    	te.display(te.calculateRunrate(), te.calculateBalls());
	    	break;
	    }
	    default:
	    {
	    	System.out.println("Invalid Format type");
	    	break;
	    }
	    }
	        
	}

}


