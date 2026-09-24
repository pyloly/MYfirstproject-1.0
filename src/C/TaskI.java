import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        System.out.println(a + b + c);
    }
}