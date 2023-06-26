//55. WAP to copy all elements from an array to another array.


import java.util.*;
public class P54{
 public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the length of the array ");
    int n=s.nextInt();
    System.out.println("enter  the elements of the array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
   int arr1[]=new int[5];
   for(int i=0;i<n;i++){
     arr1[i]=arr[i];
      System.out.println("the copied elements from array to array1 is" +arr1[i]);
   }
 }
}