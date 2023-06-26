//65. WAP to find total number of alphabets, digits or special     character in a string.
import java.util.Scanner;

public class P65{

  public static void main(String args[]){
      Scanner s=new Scanner (System.in);
    System.out.println("enter the string ");
    String n=s.nextLine();
int splchar=0;
    int alphabets =0;
    int digits=0;
   for(int i=0;i<n.length();i++){
     char c=n.charAt(i);
     if(c>='A' && c<='Z' || c>='a'&&  c<='z'){
       alphabets++;
     }
     else if(c>='0' && c<='9'){
       digits++;
       
     }
     else if(c=='@' || c=='#' || c=='&' || c=='$'){
       splchar++;
     }
   } 
    System.out.println("the alphabets are: "+alphabets);
    System.out.println("the digits are "+digits);
    System.out.println("the spl character" +splchar);
  }
}