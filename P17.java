//17. WAP to print all natural numbers from 1 to n. - using while loop

import java.util.*;
public class P17{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
    int count=0;
   // int temp=n;
    while(count<n){
       count=count+1;    
    
        System.out.println(count +" ");  
    }
    }
  }
