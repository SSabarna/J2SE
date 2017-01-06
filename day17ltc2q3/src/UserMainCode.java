class UserMainCode {
	public static boolean validatePlayer(String d,String co,String f)
	{
		
		int i;
		String ch = "";
		if(co.contains(" "))
		{
			String parts[] = co.split(" ");
			for(i=0;i<parts.length;i++)
			{
				ch = ch+parts[i].substring(0,1).toUpperCase();
			}
		}
		else
			ch = co.substring(0,3).toUpperCase();
		
		if(f.equals(d+"#"+ch))
			return true;
		else
			return false;
		
	}
}