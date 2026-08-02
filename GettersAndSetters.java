package core  ;

class d {
	private int a;
	private float f;
	private	String b;
	private	char c;
	public int getA() {
	return a;
	}
	public void setA(int q) {
	a=q;
	}
	public float getf() {
		return f;
	}
	public void setf(float r) {
		f=r;
	}
	public String gets() {
		return b;
	}
	public void sets(String s) {
		b=s;
	}
		public char getc() {
			return c;
		}
		public void setc(char t) {
			c=t;
		}
}	
			
	public class GettersAndSetters {
	public static void main(String[] args) {
		d obj = new d();
		obj.setA(100);
		System.out.println(obj.getA());
		obj.setf(3.14f);
		System.out.println(obj.getf());
		obj.sets(null);
		System.out.println(obj.gets());
		obj.setc('X');
		System.out.println(obj.getc());
	}
}