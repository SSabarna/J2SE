
public class UserMainCode {

	public static void display(String a,String b)
	{
		StringBuilder sa = new StringBuilder(a);
		StringBuilder sb = new StringBuilder(b);
		String s1[] = a.split(" ");
		String s2[] = b.split(" ");
		if(s1[1].equals(s2[1]))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
