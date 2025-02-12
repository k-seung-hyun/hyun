package p0212;

import java.util.ArrayList;

public class ListTest4 {
	
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		
		c1.setCpu("컴퓨터");
		c1.setRam("램1");
		c1.setHdd("hdd");
		
		c2.setCpu("컴퓨터");
		c2.setRam("램2");
		c2.setHdd("hdd");
		
		c3.setCpu("컴퓨터");
		c3.setRam("램3");
		c3.setHdd("hdd");	
		
		ArrayList<Computer> computers = new ArrayList<>();
		
		computers.add(c1);
		computers.add(c2);
		computers.add(c3);
		
		for(Computer c:computers) {
			String cpu = c.getCpu();
			String ram = c.getRam();
			String hdd = c.getHdd();
			
			if(ram.equals("램2")) {
				System.out.println(c);				
			}
		}
	}

}
