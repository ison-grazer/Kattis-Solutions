import java.util.*;
import java.lang.String;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDays = sc.nextInt();
        int daysBelowZero = 0;
        for (int i = 0; i < numDays; i++) {
            if (sc.nextInt() < 0){
                daysBelowZero++;
            }
        }
        System.out.println(daysBelowZero);
    }
}
