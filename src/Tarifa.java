import java.util.*;
import java.lang.String;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int availableData = sc.nextInt();
        int activeMonths = sc.nextInt();
        //how much has accumulated
        int dataLeft = 0;
        for (int i = 0; i < activeMonths; i++) {
            int tmp = sc.nextInt();
            dataLeft = (availableData - tmp) + dataLeft;
        }
        //at the beginning of the new month
        dataLeft = dataLeft + availableData;
        System.out.println(dataLeft);
    }
}
