class Node{
	int data;
	Node next;

	Node(){
		data=0;
		next=null;
	}

	void setData(int d){
		data=d;
	}

	void setNext(Node n){
		next=n;
	}

	int getData(){
		return data;
	}

	Node getNext(){
		return next;
	}
}

class CirLinkedList{
	Node head;
	Node tail;
	int size;

	void display(){
		Node t=head;
		System.out.println("Circular Linked List: ");
		for(int i=1 ; i<=size ; i++){
			System.out.print(t.getData()+" ");
			t=t.getNext();
		}
		System.out.println();
	}

	void repeatDisplay(int num){
		Node t=head;
		System.out.println("Circular Linked List in Repeat: ");
		for(int i=1 ; i<=num ; i++){
			System.out.print(t.getData()+" ");
			t=t.getNext();
		}
		System.out.println();
	}

	void displaySize(){
		System.out.println("Circular Linked List size is "+size);
	}

	void insertatBeg(int d){
		Node n = new Node();
		n.setData(d);

		if(head==null){
			head=n;
			tail=n;
		}
		else{
			n.setNext(head);
			head=n;
			tail.setNext(head);
		}
		size++;
	}

	void insertatLast(int d){
		if(head==null){
			insertatBeg(d);
		}
		else{
			Node n = new Node();
			n.setData(d);
			n.setNext(head);
			tail.setNext(n);
			tail=n;
			size++;
		}
	}

	void insertatPos(int d, int pos){
		if(head==null || pos==1){
			insertatBeg(d);
		}
		else if(pos>size){
			insertatLast(d);
		}
		else{
			Node n = new Node();
			n.setData(d);
			Node t=head;
			for(int i=1 ; i<pos-1 ; i++){
				t=t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
	}

	void deleteatBeg(){
		if (head==null){
			System.out.println("Linked List is empty");
		}
		else{
			head=head.getNext();
			tail.setNext(head);
			size--;
		}
	}

	void deleteatLast(){
		if(size<=1){
			deleteatBeg();
		}
		else{
			Node t=head;
			for (int i=1 ; i<size-1 ; i++){
				t=t.getNext();
			}
			t.setNext(head);
			size--;
		}
	}
	

	void deleteatPos(int pos){
		if(size<=1){
			deleteatBeg();
		}
		else if (pos>=size){
			deleteatLast();
		}
		else {
			Node t=head;
			for(int i=1 ; i<pos-1 ; i++){
				t=t.getNext();
			}
			Node k = t.getNext();
			t.setNext(k.getNext());
			size--;
		}
	}
}

public class Practical6 {
    public static void main(String[] args) {
        CirLinkedList cll = new CirLinkedList();
        cll.insertatBeg(5);
        cll.insertatBeg(75);
        cll.display();
        cll.insertatLast(20);
        cll.display();
        cll.insertatPos(12, 3);
    }
}
