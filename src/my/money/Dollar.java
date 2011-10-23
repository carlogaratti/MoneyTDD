package my.money;

public class Dollar extends Money{

	public Dollar(int i) {
		this.amount = i;
	}

	public Money times(int multiplayer) {
		return new Dollar(amount * multiplayer);
	}
	

}
