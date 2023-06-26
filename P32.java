//32,. WAP to enter a number and print its reverse.


import java.util.*;
public class P32{
  public static void main(String args[]){

    Scanner s=new Scanner (System.in);
    System.out.println("enter the number : ");
    int n=s.nextInt();
    int rev=0,rem=0,temp;
    while(n>0){
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
    }
  System.out.println("the reverse number is  " +rev);
  }
}
