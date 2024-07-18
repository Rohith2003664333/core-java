//progrma to try multiple block
package core.java;

public class Prog2 {
	public static void divide (){
	int a=6,b=0,c,d;
	try {
		c=a/b;
		d=b/a;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("exception caught"+e.getMessage());
	}
	}

}
