package core.java;

public class prog {
	
	public static void main(String args[]) {
		
		int d=0;
		try {
		int a=42/d;//exception is raised
		System.out.println("Rohith");
		}
		catch(ArithmeticException e) {
		
		System.out.println("exception handeled sucessfuy"+e.getMessage());
		}
		System.out.println("will be printed");
	}

}
