import java.util.Scanner;
public class TaskD2 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int a1 = scanner.nextByte();
        int b1 = scanner.nextByte();
        int a2 = scanner.nextByte();
        int b2 = scanner.nextByte();
        if (Math.abs(a1-a2)==Math.abs(b1-b2) || (a1==a2 || b1==b2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}