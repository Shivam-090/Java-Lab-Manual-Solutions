// Write a program to create a doubly linked list of n nodes and perform:
// •	Insertion
// o	At the beginning
// o	At the end
// o	At a specific location
// •	Deletion
// o	At the beginning
// o	At the end 
// o	At a specific location

class node {
    int data;
    node next;
    node prev;

    node() {
        data = 0;
        next = null;
        prev = null;
    }

    node(int d, node n, node p) {
        data = d;
        next = n;
        prev = p;
    }

    void setData(int d) {
        data = d;
    }

    void setNext(node n) {
        next = n;
    }

    void setPrev(node p) {
        prev = p;
    }

    node getNext() {
        return next;
    }

    int getData() {
        return data;
    }

    node getPrev() {
        return prev;
    }
}

class DoublyLinkedList {
    int size = 0;
    node head = null;
    node tail = null;

    void insertAtFirst(int d) {
        node n = new node();
        if (head == null) {
            head = tail = n;
        } else {
            n.setNext(head);
            head.setPrev(n);
            head = n;
        }
        n.setData(d);
        size++;
    }

    void insertAtLast(int d) {
        node n = new node();
        if (head == null) {
            insertAtFirst(d);
        } else {
            n.setData(d);
            tail.setNext(n);
            n.setPrev(tail);
            tail = n;
            size++;
        }
    }

    void insertAtPos(int d, int pos) {
        if (head == null || pos == 1) {
            insertAtFirst(d);
            
        } else if (pos > size) {
            insertAtLast(d);
        } else {
            node n = new node();
            n.setData(d);
            node t = head;
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            node k = t.getNext();
            n.setNext(k);
            n.setPrev(t);
            t.setNext(n);
            k.setPrev(n);
            size++;
        }
    }

    void deleteatBeg(){
		if (head==null){
			System.out.println("Linked List is empty");
		}
		else{
			head=head.getNext();
			head.setPrev(null);
			size--;
		}
	}

	void deleteatLast(){
		if(size<=1){
			deleteatBeg();
		}
		else{
			tail=tail.getPrev();
			tail.setNext(null);
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
			node t= head;
			for(int i=1 ; i<pos-1 ; i++){
				t=t.getNext();
			}
			node k = t.getNext();
			node j = k.getNext();
			t.setNext(k.getNext());
			j.setPrev(k.getPrev());
			size--;
		}
	}

    void display() {
        node t = head;
        if (head == null) {
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
}

public class Practical5 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFirst(3);
        dll.insertAtFirst(6);
        dll.display();
        dll.insertAtLast(32);
        dll.display();
        dll.insertAtPos(5, 4);
        dll.display();
    }
}
