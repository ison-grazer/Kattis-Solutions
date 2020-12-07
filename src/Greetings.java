import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greeting = sc.next();
        int numE = (greeting.length()-2)*2;
        StringBuilder longerGreeting = new StringBuilder();
        for (int i = 0; i < numE; i++) {
            longerGreeting.append("e");
        }
        System.out.println("h" + longerGreeting + "y");
    }
}