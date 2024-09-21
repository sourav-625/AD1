import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter " + n + " numbers");
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of provided numbers is: " + sum);
        sc.close();
    }
}