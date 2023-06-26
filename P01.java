import java.util.*;

public class P1{

  public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the first number");
    int a=s.nextInt();
    System.out.println("enter the second number");
    int b=s.nextInt();
    if(a>b){
      System.out.println(a +"is  maximum");
    }
    else{
      System.out.println(b +"is maximum");
    }
  }
}
