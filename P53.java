//54. WAP to count total number of negative elements in an array.


import java.util.*;
public class P53{
 public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the length of the array ");
    int n=s.nextInt();
    System.out.println("enter  the elements of the array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
   int count=0;
   for(int i=0;i<n;i++){
   if(arr[i]<0){
      count=count+1;
   }
   }
   System.out.println("the count of total number of negative elements in an array is" +count);
 }
}