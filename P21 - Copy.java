//21. WAP to print all odd number between 1 to 100.

import java.util.*;
public class P21{
  public static void main(String args[]){
    Scanner s= new Scanner (System.in);
    int num=1;
    System.out.println("the even number from 1 to 100"); 
    System.out.println("==============================");
    while(num<=100){
      if((num%2)!=0){
        System.out.print(num +" ");
      }
      num++;
    }
  }
}