
public class Delivery {
	 void displayDeliveryDetails(String bowler,String batsman) {
		 String s1[] = bowler.split(" ");
		 String s2[] = batsman.split(" ");
		 System.out.println("Bowler : "+s1[1]);
		 System.out.println("Batsman : "+s2[1]);
		 
	 }
	 void displayDeliveryDetails(Long runs) {
		 System.out.println("Number of runs scored in the delivery : "+runs);
		 if(runs==4)
			 System.out.println("It is a Boundary.");
		 else if(runs==6)
			 System.out.println("It is a Sixer.");
	 }
}
