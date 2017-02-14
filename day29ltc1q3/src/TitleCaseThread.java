public class TitleCaseThread implements Runnable{
	String summary;
	String modifiedSummary="";
	
	
	public TitleCaseThread() {
		super();
	}

	public TitleCaseThread(String summary) {
		super();
		this.summary = summary;
	}

	public String getModifiedSummary() {
		return modifiedSummary;
	}

	@Override
	public void run() {
		int i;
		String str[]=summary.split(" ");
		for(i=0;i<str.length;i++){
			if(i!=str.length-1)
			modifiedSummary = modifiedSummary+str[i].substring(0, 1).toUpperCase()+str[i].substring(1).toLowerCase()+" ";
			else
				modifiedSummary = modifiedSummary+str[i].substring(0, 1).toUpperCase()+str[i].substring(1).toLowerCase();
		}
		
	}

}