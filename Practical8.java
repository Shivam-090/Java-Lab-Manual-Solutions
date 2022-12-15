// Write a program to create a stack and perform:
// Reversal of a sentence using stack.
// Given a string str consisting of a sentence, the task is to reverse the entire sentence word by word.
// Shivam
// 21CSU090

import java.util.*;

public class Practical8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        StackArr sa = new StackArr(strArray.length);
        for(String x : strArray){
            sa.push(x);
        }
        for(int i = 0 ;  i<strArray.length ; i++){
            strArray[i]=sa.pop();
        }
        System.out.println("Reversed Sentence: ");
        for(String x : strArray){ 
            System.out.print(x+" ");
        }
        System.out.println();
    }
}

class StackArr {
    int top = -1;
    int size;
    String[] arr;

    StackArr() {
        arr = new String[10];
    }

    StackArr(int s) {
        arr = new String[s];
    }

    void push(String temp) {

        if (top == arr.length) {
            System.out.print("Overflow");
        } else {
            top++;
            arr[top] = temp;
            size++;
        }
    }

    String pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return null;
        } else {
            String x = arr[top];
            top--;
            size--;
            return x;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Empty Stack");
        } else {
            System.out.println("\nStack :");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Top\n");
        }
    }

    int displaySize() {
        return size;
    }

    void peek() {
        System.out.println("Top is " + arr[top]);
    }
}