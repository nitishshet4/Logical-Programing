//20. WAP to print all even numbers between 1 to 100. - using while     loop

import java.util.*;
public class P20{
  public static void main(String args[]){
    Scanner s= new Scanner (System.in);
    int num=1;
    System.out.println("the even number from 1 to 100"); 
    System.out.println("==============================");
    while(num<=100){
      if(num%2==0){
        System.out.print(num +" ");
      }
      num++;
    }
  }
}