// Write a program to implement Tower of Hanoi.
// Shivam
// 21CSU090

public class Practical11 {
    public static void move(int disk, int start, int end){
        if (disk == 0){
            return;
        }
        int mid = (start + end) / 2 ;
        move(disk - 1, start, mid);
        System.out.println("Move " + disk + " from " + start + " to " + end);
        move(disk-1, mid, end);
    }
    public static void main(String[] args) {
        move(3, 1, 3);
    }
}
