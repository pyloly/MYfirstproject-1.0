import java.util.Scanner;



public class TaskR {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        int shkola = scanner.nextInt();
        int apple = scanner.nextInt();
        int a = apple%shkola;
        int b = shkola-a;
        System.out.println(b);
    }

}
