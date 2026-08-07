package sample.java;

abstract class car {
	int x = 7;
	void model () {
		System.out.println("model is SUV");
	}
	abstract void price();
}


public class Abstraction extends car {
	void price () {
		System.out.println("price is 22lakhs");
		Abstraction obj = new Abstraction();
	
}
	public static void main(String[] args) {
		Abstraction obj = new Abstraction();
		obj.model();
		obj.price();
		System.out.println("x from abst class is :" + obj.x);;
		
	}
		
	}
	
