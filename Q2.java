import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers : ");
        int a = sc.nextInt();
        int min = a;
        int max = a;
        for (int i = 0; i < n - 1; i++) {
            int b = sc.nextInt();
            if(min > b) {
                min = b;
            } if(max < b) {
                max = b;
            }
        }
        System.out.println("Minimum : " + min + " Maximum : " + max);
        sc.close();
    }
}
