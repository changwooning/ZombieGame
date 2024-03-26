package zombie;

abstract public class Player extends Unit{
	
	private int power;
	private int count;
	
	public Player(int x, int hp, int max,int count) {
		super(x, hp, max);
		this.count = count;
	}
	
}

