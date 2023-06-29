package week1.day2;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = new int[] {3,2,11,4,6,7};
		int temp = 0;
		System.out.println("Elements of original array");
		int i = 0;
		for (int i1 = 0; i1<data.length;i1++);{
			System.out.println(data[i]+ " ");
		}
		for (int i1 = 0; i1 < data.length; i1++) {     
            for (int j = i1+1; j < data.length; j++) {     
               if(data[i1] > data[j]) {    
                   temp = data[i1];    
                   data[i1] = data[j];    
                   data[j] = temp;   
               }
               
		
		// TODO Auto-generated method stub

	}

}
		 System.out.println();    
		 
		 System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i1 = 0; i < data.length; i++) {     
	            System.out.print(data[i] + " "); 
	        }
	}
}
