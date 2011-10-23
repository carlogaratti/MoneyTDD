package my.money;

public abstract class Money {
	protected int amount;
	
	public boolean equals(Object obj) {
		Money money = (Money)obj;
		return (amount == money.amount) && (obj.getClass() == this.getClass());
	}

	public static Money dollar(int amount) {
		return new Dollar(amount);
	}

	abstract Money times(int amount);

	public static Franc franc(int amount) {
		return new Franc(amount);
	}
}
