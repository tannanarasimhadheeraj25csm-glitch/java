package core;

class boy{
	int x = 20;
	public boy() {
		System.out.println("const from boy :");
	}
	void add() {
		System.out.println("add from boy :" + (x+100));
	}
}
class girl extends boy {
	int x = 10;
	public girl() {
	super();
	System.out.println("const from girl:" );
	}
	void add() {
		System.out.println("add from girl :" +(this.x+super.x));
	}
	void Supermethod() {
		super.add();
	}
}
public class SuperVsThis {
	public static void main(String[] args) {
	girl obj = new girl();
	obj.add();
	obj.Supermethod();
	}

}
