package my.money;

public  class Money {
	
	private int amount;
	private String currency;
	
	public Money(int i, String currency) {
		this.amount = i;
		this.currency = currency;
	}
	
	public boolean equals(Object obj) {
		Money money = (Money)obj;
		return (amount == money.amount) && (((Money)obj).currency == this.currency);
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount ) {
		return new Money(amount, "CHF");
	}
	
	public  Money times(int multipliers){
		return new Money(amount * multipliers, this.currency);
	}

}
