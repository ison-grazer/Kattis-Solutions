import java.util.*;
import java.lang.String;

public class Bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] correctNum = {1, 1, 2, 2, 2, 8};
        int[] addOrRemove = new int[correctNum.length];
        for (int i = 0; i < correctNum.length; i++) {
            int tmp = sc.nextInt();
            System.out.println(addOrRemove[i] = correctNum[i] - tmp);
        }
    }
}

