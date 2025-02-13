package p0213;

public class InterfaceTest implements Action {
	public void eat() {
		System.out.println("먹는다");
	}
	public void play() {
		System.out.println("논다");
	}
	public void work() {
		System.out.println("일한다");
	}
	public void sleep() {
		System.out.println("잔다");
	}
	// implements를 하기위해서는 해당 interface에 있는 모든 개념을 적어야한다.

	public static void main(String[] args) {
		Action a = new InterfaceTest();
		a.eat();
		a.play();
		a.work();
		// a.sleep() 에러. Action이라는 interface에는 sleep이라는 것이 따로 저장되어있지않음
		
		
	}

}
