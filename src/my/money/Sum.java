package my.money;

public class Sum implements Expression {

	public Sum(Money augent, Money addend) {
		this.augend = augent;
		this.addend = addend;
	}
	public Money augend;
	public Money addend;
	
	@Override
	public Money reduce(Bank bank, String to) {
		int amount = augend.amount + addend.amount;
		return new Money(amount, to);
	}

}
