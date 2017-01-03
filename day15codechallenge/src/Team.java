
public class Team {
	 private String name;
	    private String home;
	 
	   
	   public Team(String name, String home) {
	        this.name = name;
	        this.home = home;
	     
	    }
	    
	    

	    public Team() {
	    }
	    
	    public boolean equals(Team obj) {
	        return this.name.equals(obj.name);
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getHome() {
	        return home;
	    }

	    
	    public void setHome(String home) {
	        this.home = home;
	    }

	  
	   @Override
	    public String toString() {
	        return "Team{" + "name=" + name + ", home=" + home   +  '}';
	    }
	
}
