// Write a program to implement:
// 2.	Insertions Sort
// Shivam
// 21CSU090

import java.util.*;

class Practical16b {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, j, k;
        int a[] = new int[10];
        System.out.println("Enter array elements");
        for (i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        for (j = 1; j < 10; j++) {
            k = a[j];
            i = j - 1;
            while ((i >= 0) && (a[i] > k)) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = k;
        }
        System.out.println(" ");
        System.out.println("After performing insertion sort");
        for (i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}