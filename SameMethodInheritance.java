package core;

class one {
	int x = 10;
	int sweets = 20;
    void add () {
    	 System.out.println("add from one is :" + (x+50));
    }
    void mul () {
    	System.out.println("mul from one is :" +(x*2));
    	
    	 }
}
class two extends one {
	int y = 100;
	void add () {
		System.out.println("add from two is :" + (y+100));
	}
	void mul (int b){
		System.out.println("mul from two is :" + (this.x*b));
	}
}
public class SameMethodInheritance {
public static void main(String[] args) {
	two obj = new two();
  System.out.println("sweet :" + (obj.sweets));
	obj.add();
	obj.mul(5);
}
}
