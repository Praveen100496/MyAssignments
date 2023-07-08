package week3.day1;

public class Calculator {

	public void add (int c, int d, int e) {
		System.out.println(c+d+e);
	}
		public void multiple (double f, double g) {
			System.out.println(f*g);
		}
			public void multiple (float h, float i) {
				System.out.println(h*i);
			}
				
				public static void main(String[] args) {
					
		Calculator cl = new Calculator();
		cl.add(30, 49, 50);
		cl.multiple(5.7777, 4.9999);
		cl.multiple(6.5f, 4.2f);
		// TODO Auto-generated method stub

	}

}
