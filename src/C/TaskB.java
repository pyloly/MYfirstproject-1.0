
import java.util.Scanner;

public class TaskB {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("The next number for the number "+a+" is "+(a+1)+"." );
        System.out.println("The previous number for the number "+a+" is "+(a-1)+".");


    }
}