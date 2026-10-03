import java.util.Scanner;
public class TaskA2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
    if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }

    }
}


