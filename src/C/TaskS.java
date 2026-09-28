import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int palka = scanner.nextInt();
        int ver = scanner.nextInt();
        int vni = scanner.nextInt();

        int day = (palka - vni - 1) / (ver - vni) + 1;

        System.out.println(day);
    }
}