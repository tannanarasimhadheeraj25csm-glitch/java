package core;

class one {
	int x = 20;
	void add() {
	System.out.println("add from is :" +(x+100));	
	}
}
class two {
	int y = 10;
	one obj = new one();
	void sub () {
		System.out.println("sub from two is :" +(y-5));
	}
	void add() {
		obj.add();
		System.out.println(500);
	}
}


public class OneMethodInAnother {
public static void main(String[] args) {
	two d = new two();
	d.sub();
	d.add();
	
}
}
