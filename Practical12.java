// Write a program to implement Following operations using Queue:
// 1.	Enqueue()
// 2.	Dequeue()
// 3.	Isfull()
// 4.	Isempty()
// 5.	Peek()

// a)	Using array implementation
// Shivam 
// 21CSU090

public class Practical12 {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        System.out.println("\n");
        q.dequeue();
        q.display();
        System.out.println("\n");
        q.dequeue();
        q.display();
        q.peek();
    }
}

class Queue{
	int front=-1;
	int rear=-1;
	int size;
	int max;
	int[] arr;

	Queue(){
		arr = new int[10];
		max = 10;
	}

	Queue(int s){
		arr = new int[s];
		max = s;
	}
	
	void enqueue(int d){
		if (rear==max-1){
			System.out.print("Overflow");
		}
		else{
			if (front==-1) {
				front++;
			}
			rear++;
			arr[rear]=d;
			size++;
		}
	}
	
	void dequeue(){
		if (front==-1 || front>rear){
			System.out.println("Underflow");
		}
		else{
			front++;
			size--;
		}
	}
	
	void display(){
		if (front==-1){
			System.out.println("Empty Queue");
		}
		else{
			System.out.println("Queue :");
			for(int i = front; i<=rear ; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

	void displaySize(){
		System.out.println("Queue size is "+size);
	}

	void peek(){
		System.out.print("Front is "+arr[front]);
		System.out.println(" Rear is "+arr[rear]);
	}
}