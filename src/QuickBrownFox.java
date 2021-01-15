import java.util.*;
import java.lang.String;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int loopFor = sc.nextInt();
        //nextInt skips the newline character, so need to use
        //nextLine to clear it
        sc.nextLine();
        for (int i = 0; i < loopFor; i++) {
            String missingLetters = "";
            String str = sc.nextLine().toLowerCase();
            for (int j = 0; j < alphabet.length(); j++) {
                //making charSequence into char
                if (!str.contains(Character.toString(alphabet.charAt(j)))) {
                    missingLetters = missingLetters + alphabet.charAt(j);
                }
            }
            if (missingLetters.equals("")) {
                System.out.println("pangram");
            }
            else{
                System.out.println("missing " + missingLetters);
            }
        }
    }
}