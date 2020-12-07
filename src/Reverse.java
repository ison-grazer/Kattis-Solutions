import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] reversed = new int [count];
        for (int i = count-1; i >= 0; i--) {
            reversed[i] = sc.nextInt();
        }
        for(int i : reversed){
            System.out.println(i);
        }
    }
}
