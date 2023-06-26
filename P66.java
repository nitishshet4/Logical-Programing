//66. WAP to count total number of vowels and consonants in a string.



import java.util.Scanner;

public class P66{

  public static void main(String args[]){
      Scanner s=new Scanner (System.in);
    System.out.println("enter the string ");
    String n=s.nextLine();
int splchar=0;
    int vowels =0;
    int consonant=0;
   for(int i=0;i<n.length();i++){
     char c=n.charAt(i);
     if(c=='a' || c=='e' || c=='i'&&  c=='o' || c=='u'){
       vowels++;
     }
        else{
consonant++;
        }      
       System.out.println("the vowels count"+vowels);
            System.out.println("the consonant count"+consonant);

     }
  }
}