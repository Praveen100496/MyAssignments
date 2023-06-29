package week1.day2;

import cucumber.api.cli.Main;

public class Calculator {
	public int addThreeNumbers(int a, int b, int c) {
		return a+b+c;
	}
	public float subTwoNumbers(int g,float f) {
		return g-f;
	}
	public int divTwoNumbers(int d, int e) {
		return d%e;
	}
	
	public static void main(String[] args) {
		Calculator number = new Calculator();
		int threeNumbers = number.addThreeNumbers(3, 4, 5);
		float twoNumbers = number.subTwoNumbers(8, 5.5f);
		int i = number.divTwoNumbers(4, 2);
		System.out.println(threeNumbers);
		System.out.println(twoNumbers);
		System.out.println(i);
	}
		
		
		
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub

	
		
		// TODO Auto-generated method stub

	}


