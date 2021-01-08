import java.util.*;
import java.lang.String;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String problems = sc.next();
        String[] splitString = problems.split(";");
        int numProblems = 0;
        for (String s : splitString) {
            if (s.contains("-")) {
                String[] tmp = s.split("-");
                numProblems = numProblems + (Integer.parseInt(tmp[1]) - Integer.parseInt(tmp[0]));
            }
            numProblems++;
        }
        System.out.println(numProblems);
    }
}
