package javacore;

class BookContaining{
	String book_id = "A256256";
	String book_name = "java";
	String author = "Santosh";
	int price = 1999;
	   void conts () { 
		   System.out.println("bookid, bookname, authorname,bookprice : " +book_id+ " " +book_name+ " " +author+ " " +price );
		   }
}
class Constructors{
	 int rollno = 210;
     String name = "sai";
     float marks = 92.3f;
     String college = "raghu";
    
		Constructors(int n, String x, float y){
		   this.rollno = n;
		   this.name = x;
		   this.marks = y;  
		   System.out.println("college is : " +college);
		   System.out.println("rollno : " +rollno);
			System.out.println("name is : " +name);
			System.out.println("marks is : " +marks);
	       }
	  }
class Const{
	int x = 3;
	String y = "kesava";
	void again() {
		System.out.println("x is : " +x);
		System.out.println("name is : " +y);
	}
		Const (){
			int x = 5;
			System.out.println("x is : " +x);
			
		}
}
public class Task2 {
 public static void main(String[] args) {
	 BookContaining obj = new BookContaining();
	 obj.conts();
	 Constructors con = new Constructors(256,"dheeraj",86.7f);
	 Const abc = new  Const();
	 abc.again(); 
	 }
 }

