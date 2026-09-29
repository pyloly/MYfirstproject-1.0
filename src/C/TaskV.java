import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = a - b;
        int k = (d + 1000) / 1000;

        System.out.println(a * k + b * (1 - k));
    }
}
