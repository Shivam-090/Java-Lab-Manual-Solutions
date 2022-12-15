// Create an array of integer with size n. Return the difference between the largest and the smallest value inside that array.
// Shivam 21CSU090
// Practical 1

import java.util.*;

public class Practical1 {
    public static void main(String args[]) {
        int size = 0, min, max;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of array :");
        size = ob.nextInt();
        int arr[] = new int[size];
        min = arr[0];
        max = arr[0];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = ob.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }
        }
        System.out.println("Difference of max and min value is : " + (max - min));
    }
}