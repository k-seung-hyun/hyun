package prac;

public class Singer {
	private String name;
	private String album;
	private int num;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public String toString() {
		return "[name=" + name + ",album" + album + ",num" + num + "]";
	}

}
