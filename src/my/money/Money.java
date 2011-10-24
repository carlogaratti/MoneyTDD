package my.money;

public  class Money implements Expression {
	
	protected int amount;
	private String currency;
	
	public Money(int i, String currency) {
		this.amount = i;
		this.currency = currency;
	}
	
	public boolean equals(Object obj) {
		Money money = (Money)obj;
		return (amount == money.amount) && 
		(((Money)obj).currency == this.currency);
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

	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}

	@Override
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}

}
