// How we can print the following in 2-D integer array with each element of maximum 2 digits 
// a) Elements of the entered array.
// b) Elements of the array after each element is multiplied by 2 if it is an odd number.
// Shivam
// 21CSU090

import java.util.*;
public class Exp3_2 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 2D array ");
        size = sc.nextInt();
        int arr[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter the element of " + (i+1) + ", " + (j+1) + " element");
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Array: ");
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j]%2 != 0) {
                    arr[i][j] = arr[i][j]*2; 
                }
            }
        }
        System.out.println("Multiplying Array by 2: ");
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
