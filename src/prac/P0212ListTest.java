package prac;

import java.util.ArrayList;

import p0212.Human;

public class P0212ListTest {

	public static void main(String[] args) {
		// 해당 people의 메모리타입은 Human만 가능하다.
		ArrayList<Human> people = new ArrayList<>();
		
		for(int i=1;i<=1;i++) {
			Human h = new Human();
			int age = (int)(Math.random() * 100)+1;
			int weight = (int)(Math.random() * 50) + 50;
			h.setName("이름" + i);
			h.setAddress("주소" + i);
			h.setAge(age);
			h.setWeight(weight);
			people.add(h);
		}
	}
}
