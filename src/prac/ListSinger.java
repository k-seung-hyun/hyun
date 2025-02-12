package prac;

import java.util.ArrayList;

public class ListSinger {

	public static void main(String[] args) {
		Singer s1 = new Singer();
		Singer s2 = new Singer();
		Singer s3 = new Singer();
		Singer s4 = new Singer();
		Singer s5 = new Singer();
		
		s1.setName("빅뱅");
		s1.setAlbum("haruharu");
		s1.setNum(1);
		
		s2.setName("빅나티");
		s2.setAlbum("vancouver");
		s2.setNum(11);
		
		s3.setName("기리보이");
		s3.setAlbum("시간이 날 기다려");
		s3.setNum(1);
		
		s4.setName("뉴진스");
		s4.setAlbum("hypeboy");
		s4.setNum(2);
		
		s5.setName("아이브");
		s5.setAlbum("lovedive");
		s5.setNum(7);
		
		ArrayList<Singer> singers = new ArrayList<>();
		
		singers.add(s1);
		singers.add(s2);
		singers.add(s3);
		singers.add(s4);
		singers.add(s5);
		
		// album에 하루하루나 벤쿠버가 있는 사람을 출력
		for(Singer s:singers) {
			String album = s.getAlbum();
			if(album.equals("haruharu") || album.equals("vancouver")) {
				System.out.println(s);
			}
		}
	}
}
