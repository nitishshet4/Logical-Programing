//42. WAP to find all prime factors of a number.


import java.util.Scanner;

public class P41 {
   public static void main(String args[]){
      int number;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number ::");
      number=sc.nextInt();
     
      for(int i=2;i<number;i++) {
         while(number%i==0) {
            System.out.println(i+" ");
            number=number/i;
         }
      }
      if(number>2) {
         System.out.println(number);
      }
   }
}