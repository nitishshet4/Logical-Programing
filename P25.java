//25. WAP to print multiplication table of any number.

import java.util.Scanner;

public class P25{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of multiplication table");
    int n=s.nextInt();
    System.out.println("enter the length of multiplication table ");
    int len=s.nextInt();
    int mul=0;
    System.out.println("the multiplication table" +" "+n +" "+"is :");
    for(int i=0;i<=len;i++){
      mul=n*i;
      System.out.println(n +" "+"* " +i +" "+"is" +" "+mul);
    }
  }
}
