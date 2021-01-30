import java.util.*;

public class Kemija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secretMessage = sc.nextLine();
        sc.close();
        //the same actions will be taken, regardless of the words
        secretMessage = secretMessage.replaceAll("apa", "a");
        secretMessage = secretMessage.replaceAll("epe", "e");
        secretMessage = secretMessage.replaceAll("ipi", "i");
        secretMessage = secretMessage.replaceAll("opo", "o");
        secretMessage = secretMessage.replaceAll("upu", "u");

        System.out.println(secretMessage.trim());
    }
}