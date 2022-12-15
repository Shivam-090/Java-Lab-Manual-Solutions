// Write a program to implement:
// 3.	Selection Sort
// Shivam
// 21CSU090

import java.util.*;
public class Practical16c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, t, min;
        int a[] = new int[10];
        System.out.println("Enter array elements");
        for (i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        for (i = 0; i < 9; i++) {
            min = i;
            for (j = i + 1; j < 10; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
        System.out.println(" ");
        System.out.println("After performing Selection sort");
        for (i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
