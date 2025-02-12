package p0212;

public class MethodTest {

	static void test() {
		System.out.println("걍 테스트");
	}
	static void test(int i) {
		System.out.println("인트매개 테스트");
		
	}
	public static void main(String[] args) {
		test();
		test(1);
	}
}
