import java.util.Scanner;

public class TaskG2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();


        if ((k +4)%4 == 0 || k == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}