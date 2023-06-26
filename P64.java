//64. WAP to find length of a string and compare and concatenate two     strings.


import java.util.Scanner;

public class P64{
  public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the string 1:");
    String s1=s.nextLine();
    System.out.println("enter the string 2:");
    String s2=s.nextLine();
    String s3=s1+s2;
    System.out.println("the concatinated string is: " +s3);
}
}