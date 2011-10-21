package my.money;

public class Dollar extends Money{

	public Dollar(int i) {
		this.amount = i;
	}

	public Dollar times(int multiplayer) {
		return new Dollar(amount * multiplayer);
	}
	

}
