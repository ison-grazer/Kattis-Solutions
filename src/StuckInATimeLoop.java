import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chant = sc.nextInt();
        for (int i = 0; i < chant; i++) {
            System.out.println(i+1 + " Abracadabra");
        }
    }
}
