//14. WAP to input basic salary of an employee and calculate its Gross     salary according to following:
 //   Basic Salary <= 10000 : HRA = 20%, DA = 80%
 //   Basic Salary <= 20000 : HRA = 25%, DA = 90%
  //  Basic Salary > 20000 : HRA = 30%, DA = 95%


import java.util.*;
public class P14{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the basic salary");
    int Bsalary=s.nextInt();
    int hra, da,Grosssalary;
    if(Bsalary<=10000){
      hra=(Bsalary*20)/100;
      da=(Bsalary*80)/100;
      Grosssalary=Bsalary+hra+da;
      System.out.println("the Gross salary is" +Grosssalary);
    }
    else if(Bsalary<=20000){
       hra=(Bsalary*25)/100;
      da=(Bsalary*90)/100;
      Grosssalary=Bsalary+hra+da;
      System.out.println("the Gross salary is" +Grosssalary);
    }
    else if(Bsalary>20000){
       hra=(Bsalary*30)/100;
      da=(Bsalary*95)/100;
      Grosssalary=Bsalary+hra+da;
      System.out.println("the Gross salary is" +Grosssalary);
  }
}
}