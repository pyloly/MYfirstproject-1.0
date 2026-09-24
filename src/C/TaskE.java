import java.util.Scanner;
public class TaskE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int t = scan.nextInt();
        int s = v*t ;
        if (s>109){
            while (s>109){
                 s =s-109;

            }
        }else if (s<0){
            while (s<0){
                 s = s+109;
            }

        }
        System.out.println(s);



    }

}