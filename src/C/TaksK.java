import java.util.Scanner;

public class TaksK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m =s.nextInt();
        int ch = 0;
        int min = 0;
        while (m>=1440){
            m-=1440;
        }
        while (m>=60){

            m-=60;
            ch+=1;


        }
        min =m;
        System.out.println(ch+" "+min);


    }

}
