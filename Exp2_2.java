// 2.	How to reverse the array elements.
// Shivam
// 21CSU090

import java.util.*;
public class Exp2_2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.print("\n Array in reverse order : ");
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + ",");  
        }
    }
}
