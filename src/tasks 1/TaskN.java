import java.util.Scanner;



public class TaskN {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in );
        int a = s.nextInt();
        int min = 0;
        for (int i= 1; i<=a; i+=2){
            min+=50;

        }
        for (int h = 2; h <=a; h +=2) {
            min += 60;
        }
        if (a%2==0){
            min-=15;
        }else{
            min-=5;
        }
        System.out.println(((min/60)+9)+" "+((min%60)));
    }
}
