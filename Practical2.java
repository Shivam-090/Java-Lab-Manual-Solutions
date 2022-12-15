// 2.	Write a program that initializes an array with ten random integers and then prints four lines of output, containing: 
// •	Every element at an even index
// •	Every odd element
// •	All elements in reverse order
// •	Only the first and last element
// Shivam 21CSU090
// Practical 2

import java.util.*;

public class Practical2 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int arr[] = new int[10];
        int n = arr.length;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.print("Elements at even index : ");
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("\n All odd elements : ");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]%2) != 0) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("\n Array in reverse order : ");
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + ",");  
        }
        System.out.println("\n First and last element respectively are : " +arr[0] + " and " + arr[n-1] );
    }    
}
