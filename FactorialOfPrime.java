// Sum of factorials of Prime numbers in a Linked list. Given a Linked list of N integers, the task is to find the sum of factorials of each prime element in the list.

import java.util.*;

class Node {
    int data;
    Node next;

    Node() {
        data = 0;
        next = null;
    }

    void setdata(int data) {
        this.data = data;
    }

    void setnext(Node next) {
        this.next = next;
    }

    int getdata() {
        return data;
    }

    Node getnext() {
        return next;
    }

}

// method for factorial

class fact {
    Node head = null;
    int size = 0;

    public void insert_beg(int d) {
        Node n = new Node();
        if (head == null) {
            n.setdata(d);
            head = n;
        } else {
            n.setdata(d);
            Node temp;
            temp = head;
            head = n;
            n.setnext(temp);
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp.getnext() != null) {
            System.out.println(" " + temp.getdata() + " ");
            temp = temp.getnext();
        }
        System.out.println(" " + temp.getdata() + " ");
    }

    // Check that whether given number is prime or not
    public boolean is_prime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0
                    || n % (i + 2) == 0)
                return false;

        return true;
    }

    public int factorials(int num) {
        int i = 1;
        int result = 1;
        while (i <= num) {
            result *= i;
            i++;
        }
        return result;
    }

    // Calculate the sum of all prime factorial in given linked list
    public void prime_factorial_sum() {
        if (this.head == null) {
            System.out.print("\n Empty Linked List \n");
            return;
        }
        // Define resultant variable
        int result = 0;
        // Get first node of linked list
        Node temp = this.head;
        // iterate linked list node
        while (temp != null) {
            if (is_prime(temp.data) == true) {
                // Add the factorial of prime number
                result += factorials(temp.data);
            }
            // Visit to next node
            temp = temp.next;
        }
        // Display of calculated result
        System.out.print("\n Sum Of Prime Factorials : " + result + "\n");
    }
}

public class FactorialOfPrime {
    public static void main(String[] args) {
        fact fl = new fact();
        fl.insert_beg(4);
        fl.insert_beg(6);
        fl.insert_beg(2);
        fl.insert_beg(3);
        fl.insert_beg(12);
        fl.display();
        fl.prime_factorial_sum();
    }
}
