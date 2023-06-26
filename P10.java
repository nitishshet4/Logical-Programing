//WAP to check whether a character is uppercase or lowercase     alphabet.
import java.util.*;
public class P10{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      System.out.println("enter the character ");
      char ch=s.next().charAt(0);
      if(ch>='A' && ch<='Z'){
      System.out.println("the alphabet is uppercase charcter");
      }
  //  else if(ch>='A' || ch<='Z'){
    if(ch>='a' && ch<='z'){
      System.out.println("the alphabet is lowercase charcter");
      }
  }
}