import java.util.Scanner;

public class TaskP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ch = s.nextInt();
        int min = s.nextInt();
        int sec = s.nextInt();

        int ch2 = s.nextInt();
        int min2 = s.nextInt();
        int sec2 = s.nextInt();

        System.out.println(
                (ch2 * 60 * 60 + min2 * 60 + sec2)
                        - (ch * 60 * 60 + min * 60 + sec)
        );
    }
}