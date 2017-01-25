import java.util.*;
public class PlayerComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Player p1 = (Player)o1;
		Player p2 = (Player)o2;
		if(!(p1.skill).equals(p2.skill))
				return (p1.skill).compareTo(p2.skill);
		else
			return (p1.name).compareTo(p2.name);
	}

}
