package sample.java;

class first {
int x = 10;
 void add() {
	 System.out.println("this is first class :" + (x+130));
 } 
 }
class second extends first{
	int y = 120;
	void sub() {
		System.out.println("this is second class :" + (y-20));
		
	}
	
}
public class Inheritance {
public static void main(String[] args) {
	second sec = new second();
	sec.add();
	sec.sub();
}
}