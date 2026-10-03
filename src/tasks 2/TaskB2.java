import java.util.Scanner;
public class TaskB2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in );
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2= scanner.nextInt();
        if ((a==a2 || b==b2)){
            System.out.println("YES");

        }else{
            System.out.println("NO");
        }

    }
}
