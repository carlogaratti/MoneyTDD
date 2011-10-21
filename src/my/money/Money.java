package my.money;

public class Money {
	protected int amount;
	
	public boolean equals(Object obj) {
		Money money = (Money)obj;
		System.out.println("test");
		return (amount == money.amount) && (obj.getClass() == this.getClass());
	}
}
