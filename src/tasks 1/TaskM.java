import java.util.Scanner;


public class TaskM {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int a =s.nextInt();
        int b = s.nextInt();
        int o = a;
        a=b;
        b=o;

        System.out.println(a+" "+b);
    }
}
