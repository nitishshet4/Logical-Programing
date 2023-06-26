
//18. WAP to print all natural numbers in reverse (from n to 1). -     using while loop

import java.util.*;
public class P18{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
    int count;
   // int temp=n;
    while(n<100 &&n!=0){
      
      count=n-1+1;
       
    
        System.out.println(count +" "); 
    n--;
    }
    
    }
  }
