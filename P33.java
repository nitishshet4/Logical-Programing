//33. WAP to find frequency of each digit in a given integer.

import java.util.Scanner;
 
public class P33{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);         
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int[] digit=new int[10];
         while (num!=0){             
            int lastDigit=num%10;
               digit[lastDigit]++;             
          num=num/10;
        }         
        System.out.println(" Frequency of digits are");         
        for (int i = 0; i < digit.length; i++)
        {
            if(digit[i] != 0)
            {
                System.out.println("   "+i+"   :   "+digit[i]);
            }
        } 
         
    }
}
