//9. WAP to input any character and check whether it is alphabet, digit    or special character.


import java.util.*;
 public class P9{
   public  static  void main(String args[]){
     Scanner s=new Scanner (System.in);
     System.out.println("enter the character");
     char ch=s.next().charAt(0);
       if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
        System.out.println("the charcter is alphabet");
 }
         else if(ch=='@'|| ch=='$' || ch=='&'|| ch=='*'){
       System.out.println("the character is special character");
         }
     else if(ch>='0' ||ch<='9'){
       System.out.println("the character is digit");
     }
     
     }
   }
     