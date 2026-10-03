import java.util.Scanner;

public class TaskQ {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double s = Math.ceil(b/a);
        System.out.println((int) s);

    }
}
