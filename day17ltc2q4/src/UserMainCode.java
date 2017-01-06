import java.util.Scanner;
public class UserMainCode {
	public static boolean validateCity(String str)
	{
		int flag=0;
		char a[] = str.toCharArray();
		int n = a.length;
		if(Character.isLetter(a[0]) && Character.isLetter(a[1]) && Character.isLetter(a[n-2]) && Character.isLetter(a[n-1]))
		{
			for(int i=2;i<n-2;i++)
			{
				if(a[i]=='*')
					flag++;
			}
		}
		if(flag==n-4)
			return true;
		else
			return false;
			
	}
}
