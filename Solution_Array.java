import java.io.*;
import java.util.*;

public class Solution_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Using scanner class
        int num_arr = sc.nextInt(); // input value for the n number of arrays to be merged
        int size = sc.nextInt(); // input value for common size for all arrays
        int[] mer_arr = new int[size * num_arr]; // Initializing new merged array
        int k = 0;
        int[] arr;
        for (int i = 0; i < num_arr; i++) { // Loop for traversing arrays
            arr = new int[size];
            System.out.println("\nEnter the elements of "+ (i+1) +" Array");
            for (int j = 0; j < size; j++) {
                System.out.print("Enter the "+ (j+1) + " element: ");
                arr[j] = sc.nextInt();
            }
            System.out.println();

            System.out.print("Array "+(i+1)+" Entered: ");
            for (int x : arr){
            System.out.print(x+" ");
            }
            System.out.println();

            for (int x : arr) {
                mer_arr[k] = x;
                k++;
            }
            System.out.println();
        }
        Arrays.sort(mer_arr); // Merged Array
        for (int y : mer_arr) {
            System.out.print(y + " ");
        }
        System.out.println();
    }
}