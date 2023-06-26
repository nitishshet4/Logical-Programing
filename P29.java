//29. WAP to check whether a number is palindrome or not.


import java.util.*;

public class P29{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number :");
    int num=s.nextInt();
    int rem=0,rev=0;
    int temp=num;
    while(num>0){
      rem=num%10;
      rev=rev*10+rem;
      num=num/10;
      
    }
    if(temp==rev){
      System.out.println("the number is pallindrome");
    }
    else{
      System.out.println("the number is not pallindrome");
    }
  }
}