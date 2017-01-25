public class Player implements Comparable<Player> {
private String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Player(String name) {
    super();
    this.name = name;
}

public Player() {
    super();
}

public String toString() {
    return String.format("--%s",name);
}
public int compareTo(Player r) {
    return name.compareTo(r.getName());
}
}