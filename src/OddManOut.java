import java.util.*;
import java.lang.String;

public class OddManOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopFor = sc.nextInt();
        for (int i = 0; i < loopFor; i++) {
            int[] numAttending = new int[sc.nextInt()];
            for (int j = 0; j < numAttending.length; j++) {
                //add all into list
                numAttending[j] = sc.nextInt();
            }
            int[] findOdd = new int[numAttending.length];
            for (int k = 0; k < numAttending.length; k++) {
                for (int l = k+1; l < numAttending.length; l++) {
                    if (k != l && numAttending[k] == numAttending[l]){
                        findOdd[k] = findOdd[k]+1;
                        findOdd[l] = findOdd[l]+1;
                    }
                }
            }
            for (int j = 0; j < numAttending.length; j++) {
                if (findOdd[j] == 0){
                    System.out.println("Case #" + (i+1) + ": " + numAttending[j]);
                }
            }
        }
    }
}