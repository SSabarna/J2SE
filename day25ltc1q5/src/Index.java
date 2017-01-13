
public class Index implements Comparable<Index>{
	private
	Character ch;
	Integer count;
	public Index(){
		
	}
	public Character getCh() {
		return ch;
	}
	public void setCh(Character ch) {
		this.ch = ch;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Index(Character ch, Integer count) {
		super();
		this.ch = ch;
		this.count = count;
	}
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public int compareTo(Index r) {
		return this.getCh().compareTo(r.getCh());
	}

	

}
