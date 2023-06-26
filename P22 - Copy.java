//22. WAP to find sum of all natural numbers between 1 to n.

import java.util.Scanner;

public class P22{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number to be display");
    int n=s.nextInt();
    int sum=0;
      for(int i=1;i<=n;i++){
        sum=sum+i;}
         System.out.println("the sum of all natural numbers"+sum );
      

   // System.out.println(sum);
    }
    
  }
