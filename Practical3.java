// 3	Write a program to read numbers in an integer array of size 5 and display the following:
// •	Sum of all the elements
// •	Sum of alternate elements in the array
// •	Second highest element in the array
// Shivam 21CSU090
//  Practical 3

import java.util.*;

public class Practical3 {
    public static void main(String args[]) {
        int sum = 0, alt_sum = 0;
        Scanner ob = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.print("Sum of all elements : ");
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of all elements is : " + sum);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                alt_sum = alt_sum + arr[i];
            }
        }
        System.out.println("Sum of alternate elements in the array is : " + alt_sum);
        for (int i = 0; i < arr.length; i++)   
        {  
            for (int j = i + 1; j < arr.length; j++)   
            {  
                int tmp = 0;  
                if (arr[i] > arr[j])   
                {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
            }    
        }  
        System.out.println("Second highest elements: " + arr[3]);
    }
}
