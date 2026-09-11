package EH;

import java.util.Scanner;

public class Singlecatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
		System.out.println("enter the name1 : ");
		String name1 = sc.next();
		System.out.println(+ name1.length() + "is the length of name1");
		System.out.println("enter the name2 : ");
		String name2 = null;
		System.out.println( "the length of name2 is :" +name2.length());
	} catch(NullPointerException e) {
		System.out.println("please enter valid name.");
	}
		sc.close();
	}
}