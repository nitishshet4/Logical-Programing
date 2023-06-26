//50. WAP to print all negative elements in an array.



public class P49 {
	
	public static void main(String[] args) {
		int[] arr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
		int i=0;
		
		System.out.print("List of Negative Numbers in an Array : ");
		while( i< arr.length) 
		{
			if(arr[i] < 0) {
				System.out.println(arr[i]);
			}
			i=i+1;
		}
	}
}