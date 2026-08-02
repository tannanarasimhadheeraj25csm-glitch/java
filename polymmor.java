package core;

class rule1 {
	int x = 100;
	 float calc_si(float p,int t,float rem) {
		 float si=(p*t*rem/100);
		 return si;
	 }
}
	 class rule2 extends rule1 {
		 @Override
		 float calc_si(float p,int t ,float rem) {
		 float si=(p*t*rem/10);
		 return si;
		 }
		 void access() {
			 float result = calc_si(1000,5,3.144f);
			 System.out.println("si value is :" + result);
		 }
	 }
		 class rule3 extends rule2 {
			 @Override
			 float calc_si(float p,int t ,float rem) {
				 float si = (p*t*rem/1000);
				 return si;
			 }
			 void access() {
				float result = calc_si(1000,10,3.14f);
				System.out.println("si value is :" + result);
			 }
		 }
		 
		 
	 
	 



public class polymmor {
	public static void main(String[] args) {
		rule2 to = new rule2();
		to.access();
		rule3 thc = new rule3 ();
		thc.access();
	}

}
