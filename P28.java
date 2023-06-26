//28. WAP to find sum of first and last digit of a number.

import java.util.*;
public class P28{
  public static void main(String args[]){
    Scanner s=new Scanner (System.in);
  System.out.println("enter the size of the digit");
   int l=s.nextInt();
    System.out.println("enter the number");
    int n=s.nextInt();
    double a = 10;
    double b = l-1;
    double result = Math.pow(a,b);
        //System.out.println(result);
    double first;
    int last;
    first=n/result;
    int c = (int)first;
      last=n%10;
    
      System.out.println("the first digit is " +c);
    System.out.println("the last digit is" +last);
    int sum=last+c;
    System.out.println("the sum of the first and the last digit is" +sum);
    }
  
  //  System.out.println(last);
}
