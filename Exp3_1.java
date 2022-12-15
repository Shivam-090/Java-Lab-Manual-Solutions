//1.	How we can count occurrence of a given number in the array and its frequency.
// Shivam
// 21CSU090

import java.util.*;
public class Exp3_1 {
    public static void main(String[] args) {
        int count = 0, ele, size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of number");
        ele = sc.nextInt();
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
               count++; 
            }
        }
        System.out.println("The count of " + ele + " is " + count);
    }
}
