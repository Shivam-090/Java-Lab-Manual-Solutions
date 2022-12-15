// Write a program to implement Following operations using Queue:
// 1.	Enqueue()
// 2.	Dequeue()
// 3.	Isfull()
// 4.	Isempty()
// 5.	Peek()

// b)	Using linked list implementation
// Shivam 
// 21CSU090

public class Practical12b {
    public static void main(String[] args) {
        QueueLL qll = new QueueLL();
        qll.displaySize();
		qll.display();
		qll.enqueueLL(10);
		qll.enqueueLL(8);
		qll.display();
		qll.dequeueLL();
		qll.enqueueLL(5);
		qll.display();
		qll.enqueueLL(7);
		qll.displaySize();
		qll.display();
		qll.displayPeek();
    }
}

class node{
    int data;
    node next;
    node() {
        data = 0;
        next = null;
    }

    void setdata(int d) {
        data = d;
    }

    void setnext(node n) {
        next = n;
    }

    int getdata() {
        return data;
    }

    node getnext() {
        return next;
    }
}

class QueueLL{
    node front = null;
    node rear = null;
    int size = 0;
    
    boolean Isempty(){
        return front == null;
    }

    int getSize(){
        return size;
    }

    void enqueueLL(int data){
        node n = new node();
        if(rear == null){
            front = rear = n;
        }
        else{
            rear.setnext(n);
            rear = rear.getnext();
        }
        n.setdata(data);
        size++;
    }

    void dequeueLL(){
        if (Isempty()) {
            System.out.println("Underflow !");
        }
        else{
            front = front.getnext();
            size--;
        }
    }

    void displayPeek(){
        System.out.println("Front is " + front.getdata());
        System.out.println("Rear is " + rear.getdata());
    }

    void displaySize(){
        System.out.println("Queue Size is " + size);
    }

    void display(){
        if (front==null){
			System.out.println("Empty Queue");
		}
		else{
			node t = front;
			System.out.println("Queue :");
			while(t.getnext()!=null){
				System.out.print(t.getdata()+" ");
				t=t.getnext();
			}
			System.out.print(t.getdata());
			System.out.println();
		}

    }
}