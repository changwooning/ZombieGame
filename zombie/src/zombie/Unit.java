package zombie;
import java.util.Random;

abstract public class Unit {

	private int x;		
	private int hp;		
	private int max;
	
	private Random ran;
	
	public Unit(int x, int hp, int max) {
		this.x = x;
		this.hp = hp;
		this.max = max;
		this.ran = new Random();
	}
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMax() {
		return this.max;
	}
	public void move() {
		if(x <= 10)
			x++;
		System.out.println("오른쪽 이동. 현재 위치 : " + x);
	}
	
	public abstract void attact(Unit unit);
	
}
