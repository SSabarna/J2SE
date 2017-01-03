import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class DeliveryBO
{
  Innings innings;
     public Delivery createDelivery(String data,Innings[] inningsList) {
      

     	String s[]=data.split(",");
     	long a=Long.parseLong(s[0]);
    	long b=Long.parseLong(s[3]);
    	long c=Long.parseLong(s[4]);
     		
     	for(int i=0;i<inningsList.length;i++)
     	{
     		if(inningsList[i]. getInningsNumber()==c)
     			innings=inningsList[i];
 		
     	}
 		
 		Delivery de=new Delivery(a,s[1],s[2],b,c,innings);
 		return de;
     }	
 
      


 public Long findInningsNumber(Delivery [] deliveryList, long deliveryNumber)

  {

long inNumb=0;
for (int i = 0; i < deliveryList.length; i++) {
	
	if(deliveryList[i]. getDeliveryNumber()== deliveryNumber)
	{
		inNumb=deliveryList[i]. getInningsNumber();
	}
	
}
return inNumb;
 }
}