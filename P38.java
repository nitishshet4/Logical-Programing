//38. WAP to calculate factorial of a number.
import java.util.*;
class P38{  
 public static void main(String args[]){  
  Scanner s=new Scanner (System.in);
   System.out.println("enter the number :");
   int n=s.nextInt();
     int fact=1;   
  for(int i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+n+" is: "+fact);    
 }  
}  
