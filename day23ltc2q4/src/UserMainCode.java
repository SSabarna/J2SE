
public class UserMainCode {
public static void display(String str,String dem)
{
	String arr[] = str.split(dem);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]);
	}
}
}
