package p0212;

import java.util.ArrayList;

public class ListTest3 {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		s1.setName("최용규");
		s1.setGrade(1);
		s1.setSchoolName("하남");
		
		s2.setName("홍길동");
		s2.setGrade(2);
		s2.setSchoolName("덕소");
		
		s3.setName("김철수");
		s3.setGrade(2);
		s3.setSchoolName("강동");
		
		s4.setName("임꺽정");
		s4.setGrade(3);
		s4.setSchoolName("이젠");
		
		s5.setName("최준호");
		s5.setGrade(1);
		s5.setSchoolName("이젠");
		
		ArrayList<Student> Students = new ArrayList<>();
		Students.add(s1);
		Students.add(s2);
		Students.add(s3);
		Students.add(s4);
		Students.add(s5);
		
//		for(Student s:Students) {
//			// 성이 최씨인 사람만 출력하세요.
//			String name = s.getName();
//			if(name.indexOf("최")==0) {
//			//다른 방법 : if(name.charAt(0) == '최'{
//			//다른 방법 : if(name.startsWith("최")){ 등등이 있다.
//				System.out.println(s);
//			}
//		}
		for(Student s:Students) {
			// 성이 최씨이거나 학교를 "이젠"으로 다니는 사람만 출력
			String name = s.getName();
			String schoolName = s.getSchoolName();
			if(name.startsWith("최") || schoolName.equals("이젠")) {
				System.out.println(s);				
			}
		}
	}
}
