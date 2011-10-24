package my.money;

public interface Expression {

	Money reduce(Bank bank, String to);

}
