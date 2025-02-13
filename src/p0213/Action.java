package p0213;

public interface Action {
	
	void eat();
	void play();
	void work();
	
	/*
	 * interface는 메서드의 선언만 가능하며 구현은 불가하다(바디를 만들수 없다,{ 사용불가)
	 * interface에서 메서드의 접근제어자는 public만 가능하다, 즉 안쓴다면 public
	 * (원래 따로 선언하지않는다면 디폴트이지만 interface내에서는 public이다.)
	 * 생성자를 만들 수 없다, 메모리를 생성할 수 없다, 데이터 타입으로는 사용가능하다.
	 */
}
