import java.util.*;
public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> l=new ArrayList<Integer>();
        int i,sum=0,m,r,v=0;
        for(i=0;i<n;i++)
        {
            l.add(Integer.parseInt(sc.nextLine()));
            m=(Integer)l.get(i);
        }
        for(i=0;i<n;i++)
        {
            m=(Integer)l.get(i);
            if(m==7)
                continue;
            while(m>0)
            {
                r=m%10;
                m=m/10;
                v=v*10+r;
            }
            while(v>0)
            {
                r=v%10;
                if(r==7)
                    break;
                else
                    sum+=r;
                v=v/10;
            }
            
        }
        System.out.println(sum);
	}

}
