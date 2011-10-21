package my.money;

public class Franc extends Money{

	public Franc(int i) {
		this.amount = i;
	}

	public Franc times(int multiplayer) {
		return new Franc(amount * multiplayer);
	}

}
