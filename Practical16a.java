// Write a program to implement:
// 1.	Bubble Sort
// Shivam
// 21CSU090

import java.util.*;

class Practical16a {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, j, t;
        int a[] = new int[10];
        System.out.println("Enter array elements");
        for (i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        for (i = 0; i < 9; i++) {
            for (j = 0; j < (9 - i); j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.println(" ");
        System.out.println("After perfoming bubble sorting");
        for (i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}