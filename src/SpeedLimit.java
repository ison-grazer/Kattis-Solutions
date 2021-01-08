import java.util.*;
import java.lang.String;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int dataSet = sc.nextInt();
            if (dataSet != -1) {
                int oldDistance = 0;
                int totForDataset = 0;
                for (int i = 0; i < dataSet; i++) {
                    int speed = sc.nextInt();
                    int newDistance = sc.nextInt();
                    totForDataset = ((newDistance - oldDistance) * speed) + totForDataset;
                    oldDistance = newDistance;
                }
                System.out.println(totForDataset + " miles");
            }
        }
    }
}