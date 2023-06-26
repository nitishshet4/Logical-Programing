//49. WAP to print Fibonacci series up to n terms


public class P48{

  public static void main(String args[]){
    int n=100;
    int a=0,b=1;
    System.out.print(a +"," +b +",");
    int c;
    for(int i=2;i<n;i++){
      c=a+b;
      a=b;
      b=c;
      System.out.print(c +",");
    }
  }
}