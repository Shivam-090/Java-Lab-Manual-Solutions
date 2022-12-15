// Write a method called median() that accepts an array of integers as its argument and returns the median of the numbers in the array. 
// The median is the number that will appear in the middle if you arrange the elements in order.
// Shivam
// 21CSU090

import java.util.*;
public class Exp3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Array is : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("The median of the array of length " + size + " is " + median(arr,size) );
    }

    static int median(int arr[], int size){
        Arrays.sort(arr);
        int i;
        if(size % 2 == 0){
            i = ((size/2) + (size/2)+1)/2;
        }
        else{
            i = size/2;
        }
        return arr[i];
    }
}
