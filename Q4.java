import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers: ");
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        for(int i = 0; i <= n / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[n - i - 1];
            ar[n - i - 1] = temp;
        }
        for(int e : ar) {
            System.out.print(e + " ");
        }
        sc.close();
    }
}