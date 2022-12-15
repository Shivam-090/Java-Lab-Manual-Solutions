// 5.	How to insert an element (specific position) into an array.
// Shivam
// 21CSU090

import java.util.*;
public class Exp2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array: ");
        for (int i = 0; i < size-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position at which you want to insert: ");
        int pos = sc.nextInt();
        System.out.println("Enter the element at which you want to insert: ");
        int ele = sc.nextInt();
        for (int i = size-1; i > pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = ele;
        System.out.println("New Array " + Arrays.toString(arr));
    }
}
