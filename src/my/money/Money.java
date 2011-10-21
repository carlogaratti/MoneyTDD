package my.money;

public class Money {
	protected int amount;
	
	public boolean equals(Object obj) {
		
		return (((Money)obj).amount == this.amount) && (obj.getClass() == this.getClass());
	}
}
