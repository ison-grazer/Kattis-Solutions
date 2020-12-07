import java.util.*;
import java.lang.String;

public class pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        double result = 0;
        int toLoop = sc.nextInt();

        while (toLoop != 0) {
            numbers.add(sc.nextInt());
            toLoop--;
        }

        for (int i = 0; i < numbers.size(); i++) {
            String tmp = numbers.get(i).toString();
            String base = tmp.substring(0, tmp.length() - 1);
            String power = tmp.substring(tmp.length() - 1);
            result = Math.pow(Integer.parseInt(base), Integer.parseInt(power)) + result;
        }
        System.out.println((int)result);
    }
}