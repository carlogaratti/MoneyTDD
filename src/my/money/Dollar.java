package my.money;

public class Dollar {

	public int amount;

	public Dollar(int i) {
		this.amount = i;
	}

	public Dollar times(int multiplayer) {
		return new Dollar(amount * multiplayer);
	}

}
