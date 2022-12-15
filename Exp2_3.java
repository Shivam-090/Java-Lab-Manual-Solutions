// 3.	How to find the index of an array element
// Shivam
// 21CSU090

import java.util.*;
public class Exp2_3 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int arr[] = {1,2,6,9,4,34,95,100};
        System.out.println("Enter the element you want index of: ");
        int ele = ob.nextInt();
        int i = 0, len = arr.length;
        while (i < len) {
            if (arr[i] == ele) {
                System.out.println("Index is " + i);
                break;
            }
            else{
                i++;
            }
       }
    }
}
