
public class UserMainCode {

	public static void display(String a,String b)
	{
		StringBuilder sb = new StringBuilder(b);
		StringBuilder sa = new StringBuilder(a);
		String sc = sa.substring(0,1);
		String sd = sa.substring(1);
		System.out.println(sc.toUpperCase()+sd.toLowerCase()+" "+b.toUpperCase());
	}
}
