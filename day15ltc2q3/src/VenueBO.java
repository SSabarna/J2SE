
public class VenueBO {
	public Venue createVenue(String data, City[] cityList) {
	       //fill your code
	    	String g[]=data.split(",");
	    	int i;
	    	for(i=0;i<cityList.length;i++)
	    	{
	    		if(g[1].equals(cityList[i].getName()))
	    			break;
	    	}
	    	Venue v=new Venue(g[0],cityList[i]);
	    	return v;
}
}
