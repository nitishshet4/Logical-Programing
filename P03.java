import java.util.*;

public class P3{
  public static  void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the number");
    int num=s.nextInt();
    if(num>0){
      System.out.println(num +"the number is positive");
    }
    else if(num<0){
      System.out.println(num +"the number is negative");
    }
    else{
      System.out.println(num +" is zero");
    }
  }
}
