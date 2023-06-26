import java.util.*;
public class  P4{
  public static void main(String args[]){
  Scanner s=new Scanner (System.in);
  System.out.println("enter the number");
    int num=s.nextInt();
    if(num%5==0&& num%11==0){
      System.out.println("the number is divisible  by 5 and 11");
    }
    else{
            System.out.println("the number is not divisible  by 5 and 11");

    }
}
}