package zombie;

public class Game {

	// 생성자 감추기
	private Game() {
		
	}
	// 클래스 내부에서 단일객체 생성하기
	private static Game instance = new Game();
	// 클래스 내부에서 게터 제공
	public static Game getInstance() {
		return instance;
	}
	
	public void run() {
		
		
		
	}
	
	
}
