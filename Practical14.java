// Write a program to implement Following operations using Doubly ended Queue:
// 1.	Enqueue()
// 2.	Dequeue()
// 3.	Isfull()
// 4.	Isempty()
// 5.	Peek()

// Using array implementation
// Shivam
// 21CSU090

public class Practical14 {
    public static void main(String[] args) {
        Deque dq = new Deque(5);
        System.out.println("Insert element at rear end  : 5 ");
        dq.enrear(5);
        System.out.println("insert element at rear end : 10 ");
        dq.enrear(10);
        System.out.println("get rear element : "+ dq.getRear());
        dq.delrear();
        System.out.println("After delete rear element new rear become : "+ dq.getRear());
        System.out.println("inserting element at front end"); 
        dq.enfront(15);
        System.out.println("get front element: " + dq.getFront());
        System.out.println("After delete front element new front become : "+ dq.getFront());
    }
}

class Deque {
    int arr[], front, rear, size;
    int arr_size = 15;

    Deque(int s) {
        arr = new int[arr_size];
        front = -1;
        rear = 0;
        size = s;
    }

    boolean Isfull() {
        return ((front == 0 && rear == size - 1) || (front == rear + 1));
    }

    boolean Isempty() {
        return (front == -1);
    }

    void enfront(int d) {
        if (Isfull()) {
            System.out.println("Overflow");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else if (front == 0) {
                front = size - 1;
            } else {
                front--;
            }
            arr[front] = d;
        }
    }

    void enrear(int d) {
        if (Isfull()) {
            System.out.println("Overflow");
        } else {

            if (front == -1) {
                front = rear = 0;
            } else if (rear == size - 1) {
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = d;
        }
    }

    void delfront() {
        if (Isempty()) {
            System.out.println("Underflow");
        } else {
            if (front == rear) {
                front = rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front++;
            }
        }
    }

    void delrear() {
        if (Isempty()) {
            System.out.println("Underflow");
        } else {
            if (front == rear) {
                front = rear = -1;
            } else if (rear == 0) {
                rear = size - 1;
            } else {
                rear--;
            }
        }
    }

    int getFront() {
        if (Isempty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }

    int getRear() {
        if (Isempty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }
}