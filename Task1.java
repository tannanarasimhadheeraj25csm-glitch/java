package problems;

/* PART A
class BasicJava{
	int x;
	float f1,f2,f3;
	String z;
	void info(String word, int num)      
    z = word;
    x = num;
    System.out.println("name is : " + z);
    System.out.println("age is : " + x);	
	}
	void accept(String name, int rollno, float marks1, float marks2, float marks3) {
		z = name;
		x = rollno;
		f1 = marks1;
		f2 = marks2;
		f3 = marks3;
		System.out.println("name is : " + z);
		System.out.println("roll number is : " + x);
		System.out.println("marks is : " +f1+" " +f2+" "+f3);
	}
	void CalcPer() {
		  float sumofmarks = f1+f2+f3;
	      int  total = 300;
		  System.out.println("total and percentage is :" +total+" "+(sumofmarks/total)*100);
		  }
	}*/

/* PART B
class ConditionalStat {
	void EvenOrOdd(int a) {
		int n=a ;
		if( n%2 == 0){
			System.out.println("the given number is even");
		}
		else{
			System.out.println("the given number is odd");
		}
	}
	void LargestOfThree(int p, int q,int r) {
		int n1 = p;
		int n2 = q;
	    int n3 = r;
		if (n1>n2 && n1>n3) {
		System.out.println("n1 is larger");
		}
		else if (n2>n1 && n2>n3) {
			System.out.println("n2 is larger");
		}
		else  {
			System.out.println("n3 is larger");
		}
			
	}
	void Grade(float per) {
		float percentage = per;
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else if (percentage >= 35) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F (Fail)");
        }

	}
	void Day(int d) {
		int day = d;
		switch (day) {
		 case 1:
             System.out.println("Monday");
             break;
         case 2:
             System.out.println("Tuesday");
             break;
         case 3:
             System.out.println("Wednesday");
             break;
         case 4:
             System.out.println("Thursday");
             break;
         case 5:
             System.out.println("Friday");
             break;
         case 6:
        	 System.out.println("Saturday");
        	 break;
         case 7:
        	 System.out.println("Sunday");
        	 break;
         default:
             System.out.println("Invalid day");
			
		}
	}
	
}
*/

class Looping{
	void tables(int tables) {
		int n = tables;
		for (int i = 1; i<=10; i++) {
			System.out.println(  n*i  );
		}
	}
	void nNumbers(int n) {
		int N = n;
		for (int i=1;i<=n;i++) {
		System.out.println(+i);
		}
	}
	void SumOfN(int num) {
		int sum = 0;
		int n = num;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum is : " + sum);
			
		}
	void fibonacci(int num) {
		 int a = 0, b = 1;
         int n = num;
	        if (n <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            System.out.println("Fibonacci Series:");
	            for (int i = 0; i < n; i++) {
	                System.out.print(a + " ");
	                int next = a + b;
	                a = b;
	                b = next;
			
		}
	}
	}

public class Task1  {
	public static void main(String[] args) {
	/* PART A
	 	BasicJava obj = new BasicJava();
		obj.info("dheeraj", 18);
		obj.accept("sai",210,92f,95.5f,98.5f);
		obj.CalcPer();
		System.out.println("result is : O Grade");
	*/
		
		/* PART B
		ConditionalStat ck = new ConditionalStat();
		ck.EvenOrOdd(5);
		ck.LargestOfThree(4, 2, 5);
		ck.Grade(65);
		ck.Day(10);
		*/
		
		Looping tb = new Looping();
		tb.tables(5);
		tb.nNumbers(50);
		tb.SumOfN(10);
		tb.fibonacci(5);
	}
}}
