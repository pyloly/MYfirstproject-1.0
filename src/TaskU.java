import java.util.Scanner;
public class TaskT {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int so = (a/b+b/a)/(a/b+b/a)+(a%b*b%a);
        System.out.println(so);
    }
}
