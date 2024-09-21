import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            ar[(i + k) % n] = arr[i];
        }
        for(int e : ar) {
            System.out.print(e + " ");
        }
        sc.close();
    }
}
