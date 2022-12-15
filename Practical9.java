// Write a program to check whether the parenthesis in the expression are balanced or not.
// Shivam
// 21CSU090

import java.util.*;
public class Practical9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression : ");
        String exp = sc.nextLine();
        StackArr sa = new StackArr(exp.length());
        boolean isbalanced = true;
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(') {
                sa.push(exp.charAt(i));
            }
            else if(exp.charAt(i) == ')'){
                if (sa.size() == 0) {
                    isbalanced = false;
                    break;
                }
                else{
                    sa.pop();
                }
            }
        }

        if (isbalanced) {
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}

class StackArr{
	int top=-1;
	int size;
	int[] arr;

	StackArr(){
		arr = new int[10];
	}

	StackArr(int s){
		arr = new int[s];	
	}
	
	void push(int d){

		if (top==arr.length){
			System.out.print("Overflow");
		}
		else{
			top++;
			arr[top]=d;
			size++;
		}
	}
	
	void pop(){
		if (top==-1){
			System.out.println("Underflow");
		}
		else{
			top--;
			size--;
		}
	}
	
	void display(){
		if (top==-1){
			System.out.println("Empty Stack");
		}
		else{
			System.out.println("\nStack :");
			for(int i = top; i>=0 ; i--){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("Top\n");
		}
	}

	int size(){
        return size;
    }

	void peek(){
		System.out.println("Top is "+arr[top]);
	}
}