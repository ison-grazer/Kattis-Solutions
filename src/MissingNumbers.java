import java.util.*;
import java.lang.String;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopfor = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < loopfor; i++) {
            numbers.add(sc.nextInt());
        }
        //the complete range in which to compare with
        List<Integer> range = new ArrayList<>();
        for (int i = 1; i < numbers.get(numbers.size()-1); i++) {
           range.add(i);
        }
        sc.close();

        boolean hasMissing = false;
        for(int n : range){
            if (!numbers.contains(n)){
                System.out.println(n);
                hasMissing = true;
            }
        }
        if (!hasMissing){
            System.out.println("good job");
        }
    }
}