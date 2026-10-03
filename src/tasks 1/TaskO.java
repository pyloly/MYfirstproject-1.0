import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;



public class TaskO {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b =s.nextInt();
        int n = s.nextInt();
        int sum = ((a*100) + b)*n ;
        int kol = sum/n ;
        System.out.println(sum/100+" "+sum%100);



    }
}
