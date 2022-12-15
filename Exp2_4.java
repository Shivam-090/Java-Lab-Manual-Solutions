// 4.	How to remove a specific element from an array. 
// Shivam
// 21CSU090

import java.util.*;
public class Exp2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index of array you want to remove: ");
        int element_index = sc.nextInt();
        for (int i = element_index; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println("New Array " + Arrays.toString(arr));
    }
}
