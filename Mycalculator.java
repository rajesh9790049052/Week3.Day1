package week3.day1;

public class Mycalculator {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.add();
		calc.add(5, 6);
		calc.sub();
		calc.add1();
		calc.add(2, 3, 5, 8);
		calc.add(5.66, 3.44);
		calc.sub(2.6f, 1.4f);
		calc.sub(10, 3);
		
	}

}
