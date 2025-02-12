package prac;

public class Player {

	private String name;
	private int backNum;
	private String team;
	private int positionNum;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setBackNum(int backNum) {
		this.backNum = backNum;
	}
	public int getBackNum() {
		return backNum;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getTeam() {
		return team;
	}
	public void setPositionNum(int positionNum) {
		this.positionNum = positionNum;
	}
	public int getPositionNum() {
		return positionNum;
	}
	public String toString() {
		return "[name=" + name + ",backNum=" + backNum + ",Team" + team + ",positionNum" + positionNum + "]";
		
		
	}
}
