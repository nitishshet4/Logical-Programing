//WAP to count total number of notes in given amount.


import java.util.*;

public class P12{

  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the amount");
    int amt=s.nextInt();
    int count;
    int five =0,two=0,one=0;
    if(amt%100==0){ 
      five=amt/500;
      amt=amt%500;
      two=amt/200;
      amt=amt%200;
      one=amt/100;
      amt=amt%100;
      System.out.println("the five hundres notes is" +five);
      System.out.println("the two hundres notes is" +two);
      System.out.println("the one hundres notes is" +one);

      count=five+two+one;
      System.out.println("the total numberr of notes are:" +count);
    }
      
  }
}