import java.util.*;

public class P2{

  public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the first number");
    int a=s.nextInt();
    System.out.println("enter the second number");
    int b=s.nextInt();
     System.out.println("enter the third number");
    int c=s.nextInt();
    if(a>b && a>c){
      System.out.println(a +"is  maximum");
    }
    else if(b>a && b>c){
      System.out.println(b +"is maximum");
    }
    else{
            System.out.println(c +"is maximum");

    }
  }
}
