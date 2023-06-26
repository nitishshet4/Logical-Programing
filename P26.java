//26. WAP to count number of digits in a number.


import java.util.Scanner;

public class P26{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the digit");
    long n=s.nextInt();
    int count=0;
    while(n>0){
     
      n=n/10;
      count++;
   }
    
    System.out.println(count);
  }}