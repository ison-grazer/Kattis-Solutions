import java.util.*;
import java.lang.String;

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //loop for:
        int numTests = sc.nextInt();
        for (int i = 0; i < numTests; i++) {

            int numToVisit = sc.nextInt();
            int[] storePos = new int[numToVisit];
            for (int j = 0; j < storePos.length; j++) {
                //get store positions
                storePos[j] = sc.nextInt();;
            }
            //largest distance to walk is between endpoints back and forth.
            //"\n" for formatting causing errors.
            System.out.println("\n" + ( Arrays.stream(storePos).max().getAsInt() - Arrays.stream(storePos).min().getAsInt()) * 2);
        }
    }
}
