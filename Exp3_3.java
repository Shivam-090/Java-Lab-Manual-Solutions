// Given an array of integers, return the number of times that two 6's are next to each other in the array. 
// Also count instances where the second element is 7
// Shivam
// 21CSU090

import java.util.*;
public class Exp3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_six = 0, count_seven = 0;
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (arr[i] == 6 && arr[i+1] == 6) {
                count_six+=1;
                if (arr[i+2] == 7) {
                    count_seven+=1;
                }
            }
        }
        System.out.println("Number of times that two 6's are next to each other in the array are: " + count_six);
        System.out.println("instances where the second element is 7 in the array are: " + count_seven);
    }
}
