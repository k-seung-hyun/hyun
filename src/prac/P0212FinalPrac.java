package prac;import p0212.FinalMethod;

class Mother {
	final void test() {
		System.out.println("mother's test");
	}
}
public class P0212FinalPrac extends Mother {
	void test(int a) {
		System.out.println("finanlprac's test");
	}
	public static void main(String[] args) {
		P0212FinalPrac fm = new P0212FinalPrac();
		// mother's test
		fm.test();
		// finalprac's test
		fm.test(1);
		Mother m = new P0212FinalPrac();
		// mother's test
		m.test();
		
		/*
		 * 상수는 대문자로 표기함.
		 * 변수의 앞에 final을 추가해주면 ex) final int I = 1; int I는 1에서 바뀌지않는다.
		 * 
		 */
	}

}
