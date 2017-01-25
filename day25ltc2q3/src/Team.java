import java.util.*;
public class Team implements Comparable<Team> {
private String name;
private ArrayList<Player> playerList=new ArrayList<Player>();
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public List<Player> getPlayerList() {
    return playerList;
}
public void setPlayerList(ArrayList<Player> playerList) {
    this.playerList = playerList;
}
public Team(String name) {
    super();
    this.name = name;
}
public Team() {
    super();
}
public void addPlayer(String playername){
    Player p=new Player(playername);
    this.playerList.add(p);
}

/*public List<Player> getPlayerList(List<Player> p){
    Iterator<Player> it=((TreeSet<Player>) p).iterator();
    Collections.sort(p);
    List<Player> playerList1=new ArrayList<Player>();
    while(it.hasNext()){
        //System.out.println(it.next());
        playerList1.add(it.next());
    }
    return playerList1;
}*/
public String toString() {
    return String.format("%s",name);
}
@Override
public int compareTo(Team r) {
    return name.compareTo(r.getName());
}
}