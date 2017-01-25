
public class Ranking implements Comparable<Ranking> {
private String name;
private long score;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getScore() {
	return score;
}
public void setScore(long score) {
	this.score = score;
}
public Ranking(String name, long score) {
	super();
	this.name = name;
	this.score = score;
}
@Override
public String toString() {
	return (name+" "+score);
}
public int compareTo(Ranking r) {
if(score>r.getScore())
	return 1;
else if(score<r.getScore())
	return -1;
else
	return 1;
}
}