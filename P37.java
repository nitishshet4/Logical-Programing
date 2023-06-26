//37. WAP to find all factors of a number.

import java.util.*;
public class P37{
public static void main(String[] args) {
Scanner s=new Scanner (System.in);
  System.out.println("enter the number ");
  int n=s.nextInt();
    System.out.print("Factors of " + n+ " are: ");

    // loop runs from 1 to 60
    for (int i=1;i<=n;i++) {
      if (n%i==0) {
        System.out.print(i + " ");
      }
    }
  }
}
