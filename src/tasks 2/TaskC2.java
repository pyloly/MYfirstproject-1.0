import java.util.Scanner;
public class TaskC2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a1 =scanner.nextInt ();
        int b1 =scanner.nextInt ();
        int a2 =scanner.nextInt ();
        int b2 =scanner.nextInt ();
        if (Math.abs(a1-a2)==Math.abs(b1-b2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}