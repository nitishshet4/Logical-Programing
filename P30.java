//30. WAP to calculate sum of digits of a number.

import java.util.*;

public class P30{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
    int sum=0,digit=0;
    while(n>0){
       digit=n%10;
      sum=sum+digit;
      n=n/10;

    }
     System.out.println("the sum of digits is" +sum);
  }

}
