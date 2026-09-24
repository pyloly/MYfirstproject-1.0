import java.util.Scanner;

public class Main {
    static void main() {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println(c);

    }

}