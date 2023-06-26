//58. WAP to print all unique elements in the array.


import java.util.*;   
   
class P58 {   
    public static void main (String[] args){
        int arr[]={ 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
      int len = arr.length;     
      int[] newarr=new int[20]; 
        int index = 0;  
        for (int i =0;i<len;i++){   
            int count = 0;      
            for (int j=0;j<i;j++){  
                if (arr[i]==arr[j]){   
                    count = 1;  
                    break;   
                }  
            }  
           
            if (count==0){   
                newarr[index]=arr[i];  
                index=index+1;  
            }  
        }   
        for(int i=0;i<index;i++)  
            System.out.print( arr[i] + " ");   
    }         
      
}   