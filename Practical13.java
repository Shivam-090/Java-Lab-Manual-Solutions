// Write a program to implement Following operations using Circular Queue:
// 1.	Enqueue() 
// 2.	Dequeue()
// Using array implementation
// Shivam
// 21CSU090

public class Practical13 {
    public static void main(String[] args) {
        CircularQue cqe = new CircularQue();
        cqe.Cenqueue(1);
        cqe.Cenqueue(2);
        cqe.display();
        cqe.Cdequeue();
        cqe.display();
        cqe.Cenqueue(3);
        cqe.display();
        cqe.Cenqueue(4);
        cqe.display();
    }
}

class CircularQue {
    int size = 5;
    int front, rear;
    int queue[] = new int[size];

    CircularQue() {
        front = -1;
        rear = -1;
    }

    boolean Isempty() {
        return (front == -1);
    }

    boolean Isfull() {
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            return true;
        } else {
            return false;
        }
    }

    void Cenqueue(int d) {
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
            queue[rear] = d;
        }
    }

    void Cdequeue() {
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

    void display() {
        if (Isempty()) {
            System.out.println("Queue is EMPTYY !");
        } 
        else {
            System.out.println("Queue : ");
            if (rear < front) {
                for (int i = front; i < size; i++) {
                    System.out.print(queue[i] + " ");
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i < rear; i++) {
                    System.out.print(queue[i] + " ");
                    System.out.println();
                }
            }
            else{
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
