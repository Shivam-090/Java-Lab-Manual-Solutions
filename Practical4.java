// Write a program to create a singly linked list of n nodes and perform:
// •	Insertion
// o	At the beginning
// o	At the end
// o	At a specific location
// Shivam
// 21CSU090

class node {
    int data;
    node next;

    node() {
        data = 0;
        next = null;
    }

    node(int d, node n) {
        data = d;
        next = n;
    }

    void setData(int d) {
        data = d;
    }

    void setNext(node n) {
        next = n;
    }

    node getNext() {
        return next;
    }

    int getData() {
        return data;
    }
}

class Linked {

    node head = null;
    int size = 0;

    void insertAtFirst(int d) {
        node n = new node();
        n.setData(d);
        if (head == null) {
            n.setNext(null);
        } else {
            n.setNext(head);
        }
        head = n;
        size++;
    }

    void insertAtLast(int d) {
        if (head == null) {
            insertAtFirst(d);
        } else {
            node n = new node();
            n.setData(d);
            node t = head;
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(n);
            size++;
        }
    }

    void insertAtPos(int d, int pos) {
        if (head == null || pos == 1) {
            insertAtFirst(d);
        } else if (pos >= size) {
            insertAtLast(d);
        } else {
            node n = new node();
            n.setData(d);
            node t = head;
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
    }

    void displaySize() {
        System.out.println("The size of the linked lists is " + size);
    }

    void display() {
        node t = head;
        if (t.getData() == 0) {
            System.out.println("linked list is empty");
        } else {
            System.out.println("Linked List is: ");
            for (int i = 1; i <= size; i++) {
                System.out.print(t.getData() + " ");
                t = t.getNext();
            }
        }
        System.out.println();
    }

    void deleteAtFirst() {
        if (head == null) {
            System.out.println("No linked lists exists");
        } else {
            head = head.getNext();
            size--;
        }
    }

    void deleteAtLast() {
        if (size <= 1) {
            deleteAtFirst();
        } else {
            node t = head;
            for (int i = 1; i < size - 1; i++) {
                t = t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }

    void deleteAtPos(int pos) {
        if (size <= 1) {
            deleteAtFirst();
        } else if (pos >= size) {
            deleteAtLast();
        } else {
            node t = head;
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            node k = t.getNext();
            t.setNext(k.getNext());
            size--;
        }
    }
}

public class Practical4 {
    public static void main(String[] args) {
        Linked ln = new Linked();
        ln.insertAtFirst(3);
        ln.insertAtLast(56);
        ln.display();
        ln.insertAtFirst(12);
        ln.display();
        ln.insertAtLast(60);
        ln.display();
        ln.displaySize();
        ln.insertAtPos(32, 2);
        ln.deleteAtFirst();
        ln.display();
        ln.deleteAtLast();
        ln.display();
    }
}