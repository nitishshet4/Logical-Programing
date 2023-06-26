//36. WAP to find power of a number using for loop.

import java.util.Scanner;  
public class P36  {  
public static void main(String args[])   {  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the base: ");  
int base=sc.nextInt();  
System.out.print("Enter the exponent: ");  
int exponent=sc.nextInt();  
int expo=exponent;  
long power=1;
  for(int i=1;i<=exponent;i++){  
power=power*base; 
}  
System.out.println(base +" to the power of" +expo + " is: "+power);  
}  
}    