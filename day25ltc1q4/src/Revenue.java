
public class  Revenue implements Comparable<Revenue> {
	String revenueCategory;
	Integer amount;
	public String getRevenueCategory() {
		return revenueCategory;
	}
	public void setRevenueCategory(String revenueCategory) {
		this.revenueCategory = revenueCategory;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Revenue(String revenueCategory, Integer amount) {
		super();
		this.revenueCategory = revenueCategory;
		this.amount = amount;
	}
	public Revenue() {
		super();
	}
	public String toString() {
		return String.format("%-15s%-15s",revenueCategory, amount);
	}
	public int compareTo(Revenue r) {
		return amount.compareTo(r.getAmount());
	}
	
	
}
