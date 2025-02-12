package prac;

import java.util.ArrayList;

public class BaseballPlayerList {

	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		Player p5 = new Player();
		Player p6 = new Player();
		
		p1.setName("구자욱");
		p1.setBackNum(5);
		p1.setTeam("삼성라이온즈");
		p1.setPositionNum(7);
		
		p2.setName("김영웅");
		p2.setBackNum(30);
		p2.setTeam("삼성라이온즈");
		p2.setPositionNum(5);
		
		p3.setName("김도영");
		p3.setBackNum(5);
		p3.setTeam("기아타이거즈");
		p3.setPositionNum(5);
		
		p4.setName("원태인");
		p4.setBackNum(18);
		p4.setTeam("삼성라이온즈");
		p4.setPositionNum(1);
		
		p5.setName("오승환");
		p5.setBackNum(21);
		p5.setTeam("삼성라이온즈");
		p5.setPositionNum(1);
		
		p6.setName("양현종");
		p6.setBackNum(54);
		p6.setTeam("기아타이거즈");
		p6.setPositionNum(1);
		
		ArrayList<Player> players = new ArrayList<>();
		
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		
		for(Player p:players) {
			String name = p.getName();
			int backNum = p.getBackNum();
			String team = p.getTeam();
			int positionNum = p.getPositionNum();
			
//			// 팀 소속이 삼성이면서 포지션 넘버가 1번인 사람을 출력하시오
//			if(team.contains("삼성") && positionNum==1) {
//				System.out.println(p);
//			}
//			// 팀 소속이 기아이거나 포지션이 외야인 사람을 출력하시오
//			if(team.contains("기아") || positionNum>=7) {
//				System.out.println(p);
//			}
			// 백넘버가 10이상이거나 팀소속이 삼성인 사람을 출력하시오
			if(backNum>=10 || team.contains("삼성")) {
				System.out.println(p);
			}
		}
	}
}
