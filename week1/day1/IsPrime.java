package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=5;
		boolean f= false;
		for (int i=2;i<=n/2;++i);{
			int i = 2;
			if (n %i == 0) {
				f = true;
			}
		}
		if(! f)
			System.out.println(n+"is a prime number.");
		else
			System.out.println(n+"is not a prime number");
			}
	
		
				
		// TODO Auto-generated method stub

	}

