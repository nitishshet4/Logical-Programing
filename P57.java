import java.util.*;
 
class P57 {
   public static void main (String[] args)
    {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
 
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
            if (arr[i] == arr[j])
                break;
            if (i == j)
            System.out.print( arr[i] + " ");
        }
    }
 
    }
}