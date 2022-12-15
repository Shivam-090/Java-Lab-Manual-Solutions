import java.util.*;

class Sol_stack {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : arr) {
                int ind = search(list, num);
                if (ind >= list.size()) {
                    list.add(num);
                } else if (list.get(ind) > num) {
                    list.set(ind, num);
                }
            }
            System.out.print(list.size() + " ");
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int search(ArrayList<Integer> list, int num) {
        int l = 0, r = list.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (list.get(mid) > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
