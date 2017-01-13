import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		String ans="yes";
		String revenueCategory;
		Integer amount;
		Integer total=0;
		
		Scanner sc=new Scanner(System.in);
		
		Set<Revenue> s = new TreeSet<Revenue>();
		while(ans.equals("yes")){
			System.out.println("Enter revenue category");
			revenueCategory=sc.nextLine();
			System.out.println("Enter revenue amount");
			amount=Integer.parseInt(sc.nextLine());
			total=total+amount;
			//Revenue r=new Revenue(revenueCategory, amount);
			s.add(new Revenue(revenueCategory, amount));
			System.out.println("Do you want to continue(yes/no):");
			ans=sc.nextLine();
		}
		System.out.println("Top spending categories");
		Iterator<Revenue> it=((TreeSet<Revenue>) s).descendingIterator();
		System.out.println(String.format("%-15s%-15s","Category", "Amount"));
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
		/*for(Revenue a : s){
			System.out.println(a);
			total=total+a.getAmount();
		}	*/
		System.out.println("Total amount earned: "+total);

	}

}
