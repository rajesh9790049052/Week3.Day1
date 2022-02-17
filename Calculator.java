package week3.day1;

public class Calculator {
	
	public void add() {
		
		int a =5 , b= 10;
		
		System.out.println("sum =" + (a+b));		
	}
	
	public void add(int a,int b) {
		
		System.out.println("sum =" + (a+b));
	}
	
	public void add(int a,int b,int c,int d) {
		
		System.out.println("sum = " + (a+b+c+d));
	}
	
	public void add (double aa, double bb) {
		
		System.out.println("double sum = " + (aa+bb));
	}
	
	
	
	public void sub() {
		
		int c=5, d=2;
		
		System.out.println("Diff = " + (c-d));
		
	}

	public void sub(int c, int d) {
		
		System.out.println("Diff = " + (c-d));
		
	}
	
	public void sub(float e, float f) {
		
		System.out.println("Float Diff  = " + (e-f));
		
	}
	
	public void add1() {
		
		String a= "test", b= "leaf";
		
		System.out.println("Name = " + (a+b));
		
	}

	
	
	
}
