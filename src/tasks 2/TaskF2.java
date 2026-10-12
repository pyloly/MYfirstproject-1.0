import java.util.Scanner;

public class TaskF2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        if (k>a*b) {
            System.out.println("NO");
        } else if (((a<=k) && (k%a==0))){
            System.out.println("YES");
        } else if ((b<=k) && (k%b==0)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}