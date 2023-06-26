//24. WAP to find sum of all odd numbers between 1 to n.

import java.util.Scanner;

public class P24{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number to be display");
    int n=s.nextInt();
    int sum=0;
   for(int i=1;i<=n;i++){
     if((i%2)!=0){
       sum=sum+i;
      
     }
     
   }
   System.out.println("the sum of all odd number between 1 to " +n +"is" 
 +": "+sum);
    }
}

