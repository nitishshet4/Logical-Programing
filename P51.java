//52. WAP to find maximum and minimum element in an array. 

import java.util.*;
public class P51{
 public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the length of the array ");
    int n=s.nextInt();
    System.out.println("enter  the elements of the array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
        int max = arr[0]; 
        int min = arr[0]; 
        for (int i=1;i<n;i++) {
            if (arr[i] > max) {
                max=arr[i]; // Update maximum value
            }
            if (arr[i] < min) {
                min=arr[i]; // Update minimum value
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}