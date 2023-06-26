//39. WAP to check whether a number is Prime number or not.
import java.util.*;
public class P39{    
public static void main(String args[]){
  Scanner s=new  Scanner(System.in);
  System.out.println("enter the number");
  int n=s.nextInt();
  int i,m=0;      
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");              
    }     
     else {
       System.out.println(n+" is prime number");
       
     }
   }      
}  

}
}