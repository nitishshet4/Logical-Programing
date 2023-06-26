class Main {
  public static void main(String[] args) {
    
    int num=121, rev=0, rem;
    
    int a = num;
    while (num != 0) {
      rem=num%10;
      rev=rev*10+rem;
      num=num/10;
    }
    if (a==num ){
      System.out.println(a + " is Palindrome.");
    }
    else {
      System.out.println(a + " is not Palindrome.");
    }
  }
}
