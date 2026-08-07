package sample.java;

interface model1 {
	int x = 7;
	void car();
}
interface model2 extends model1{
	int y = 13;
	void bike();
}


public class InterfaceTypes implements model2 {
	public void car () {
		System.out.println("car from model1");
	}
	public void bike () {
		System.out.println("bike from model2");
	}
	public static void main(String[] args) {
		InterfaceTypes rc = new InterfaceTypes();
		rc.car();
		rc.bike();
		System.out.println(rc.x);
		System.out.println(rc.y);
		
		
	}
}
