import java.util.*;
public class P8{
  public static  void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the alphabet");
    char ch=s.next().charAt(0);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
      System.out.println("the alphabet is vowel");
    }
    else{
      System.out.println("the alphabet is a consanant");
    }
  }
}
