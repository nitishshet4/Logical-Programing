import java.util.*;
public class P7{
  public static  void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the alphabet");
    char ch=s.next().charAt(0);
    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
      System.out.println("It is alphabet");
    }
    else{
      System.out.println("it is not  a alphabet");
    }
  }
}
