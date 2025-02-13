package p0213;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	static void printList(List<String> list) {
		for(String str : list) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		// List Map
		// 순서대로 하는 것에 있어서는 최적화이지만 지우는데에는 그렇지않음
		List<String> als = new ArrayList<>();
		als.add("4");
		als.add("2");
		als.add("3");
		printList(als);
		
		
		// 각각의 방마다 방의 앞뒤에 무엇이 있는지 알고있다.
		// 대신 순서대로 기억하고있지않음.
		List<String> lls = new LinkedList<>();
		lls.add("4");
		lls.add("2");
		lls.add("3");
		printList(lls);
	}
}
