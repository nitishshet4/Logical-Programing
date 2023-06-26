//68. WAP to find reverse of a string.


import java.util.*;

public class P68{
  public static void main(String args[]){
    String str="nitish";
    String rev=" ";

    for(int i=str.length()-1;i>=0;i--){
      rev=rev+str.charAt(i);
      
    }
    System.out.println(rev);
  }
}