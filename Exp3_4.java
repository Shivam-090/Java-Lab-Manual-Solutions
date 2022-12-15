// Write a method called swapPairs() that accepts an array of integers and swaps the elements at adjacent indexes. That is, elements 0 and 1 are swapped, elements 2 and 3 are swapped, and so on.
// If the array has an odd length, the final element should be left unmodified. For example, the list {10, 20, 30, 40, 50} should become {20, 10, 40, 30, 50} after a call to your method.
// Shivam
// 21CSU090

import java.util.*;
public class Exp3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
        System.out.println("Before Swapping: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        arr = swapPairs(arr, size);
        System.out.println("After Swapping: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int[] swapPairs(int arr[], int size) {
        int temp = 0;
        if (size % 2 == 0) {
            for (int i = 0; i < size; i += 2) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        } else {
            for (int i = 0; i < (size - 1); i += 2) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }
}
