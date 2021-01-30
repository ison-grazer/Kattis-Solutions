import java.util.*;
import java.lang.String;

public class MixedFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int denominator, divisor;
        //read line by line until line is 0 0
        while ((denominator = sc.nextInt()) != 0 && (divisor = sc.nextInt()) != 0) {
            int extracted, ans;
            //chaining assignments
            extracted = ans = 0;
            extracted = denominator / divisor;
            ans = denominator - (extracted * divisor);
            System.out.println(extracted + " " + ans + " / " + divisor);
        }
        //learned that this is good practice
        sc.close();
    }
}
