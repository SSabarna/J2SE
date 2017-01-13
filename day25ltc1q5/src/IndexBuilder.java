import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class IndexBuilder implements Comparable<Index>{
	Character ch;
	Integer count;
	public TreeSet<Index> buildIndex(HashSet<Player> player){
		TreeSet<Index> s = new TreeSet<Index>();
		Iterator<Player> it1=player.iterator();
		//Iterator<Index> it2=s.iterator();
		
		while(it1.hasNext()){
			Player p=it1.next();
			count= 0;
			Iterator<Player> it2=player.iterator();
			while(it2.hasNext()){
				if(p.getName().charAt(0)==it2.next().getName().charAt(0))
					count++;
			}
			ch=p.getName().charAt(0);
			Index i=new Index(ch, count);
			s.add(i);
		}
		
		return(s);
	}
	
	public Index findIndex(TreeSet<Index> index,char ch){
		Iterator<Index> it2=index.iterator();
		Index i=new Index();
		while(it2.hasNext()){
			if(i.getCh()==ch)
				 i=it2.next();
		}
		return i;	
	}
	
	public void displayIndex(TreeSet<Index> index){
		System.out.println(String.format("%-14s%-15s","Player", "Index")); 
		Iterator<Index> it2=index.iterator();
		while(it2.hasNext()){
			Index i=it2.next();
			System.out.println(String.format("%-15s%-15d",i.getCh(), i.getCount())); 
			
		}	
		
	}
	public int compareTo(Index r) {
		return 0;
	}

}
