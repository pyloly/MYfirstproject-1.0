import java.util.Scanner;

public class TaskL {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int st = s.nextInt();
        int ch = (st /3600)%24;
        int min = (st%3600)/60;
        int sec = st % 60;



        System.out.printf("%d:%02d:%02d", ch, min, sec);
    }





}
