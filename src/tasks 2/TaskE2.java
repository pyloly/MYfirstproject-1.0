
import java.util.Scanner;

public class TaskE2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextByte();
        int b1 = scanner.nextByte();
        int a2 = scanner.nextByte();
        int b2 = scanner.nextByte();
        if (((Math.abs(a1 - a2) == 1 && Math.abs(b1 - b2) == 2) ||
                (Math.abs(a1 - a2) == 2 && Math.abs(b1 - b2) == 1))){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}