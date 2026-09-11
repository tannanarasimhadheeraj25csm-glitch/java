package EH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
public static void main(String[] args) {
	Scanner sb = new Scanner (System.in);
	try {
	System.out.println("enter the value of a : ");
	int a = sb.nextInt();
	System.out.println("enter the value of b : ");
	int b = sb.nextInt();
	int result = a/b;
	System.out.println("result is : " +result);
	} catch (InputMismatchException ie) {
		System.out.println("enter integer values only");
	  } catch (ArithmeticException ae) {
		  System.out.println("enter another value to b ");
	  }
     sb.close();
  }
}