package p0212;

public class FinalTest {
	final int I = 1;
	public static void main(String[] args) {
		/*
		 * 변수 i = 1이었으나 2로 다시 선언을하면서 결과값이 i = 2로 바뀜
		 * final을 사용한다면 상수로 지정가능하다.
		 */
//		int i = 1;
//		i =2;
//		System.out.println(i);
		
		final int I = 1;
		// i2 = 2; 에러. 이미 final로 i를 1로 고정시켰기 때문에 더이상 수 변경이 불가하다.
		System.out.println(I);
		
		FinalTest ft = new FinalTest();
		System.out.println(ft.I);
		
		/*
		 * 명명규칙
		 * 클래스의 첫글자 = 대문자
		 * 두단어가 합쳐진다면 단어들의 맨 앞글자는 대문자
		 * 메소드의 첫글자 = 소문자
		 * 두단어가 합쳐진다면 2번째부터 맨 앞글자는 대문자
		 * 
		 * 상수 = 전부 대문자 두단어 이상이라면 단어 사이에 '_' 언더바를 사용한다.
		 */
		
	}

}
