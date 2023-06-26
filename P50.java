//51. WAP to find second largest element in an array.


import java.util.*;
public class P50 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++) {
            arr[i] = s.nextInt();
        }
      
        int max = Integer.MIN_VALUE;
    //  int sec_max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("The maximum value is : " +max);  
            int sec_max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if(arr[i]>sec_max && arr[i]!=max) {
                sec_max=arr[i];
            }
        }
        System.out.println("The second maximum value is : " + sec_max);
    }
}
