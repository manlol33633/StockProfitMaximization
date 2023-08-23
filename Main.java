import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner src = new Scanner(new File("sample.dat"));
        while (src.hasNextInt()) {
            int[] sellPrices = new int[src.nextInt()];
            int bestDiff = 0;

            for (int i = 0; i < sellPrices.length; i++) {
                sellPrices[i] = src.nextInt();
                for (int j = 0; j < i; j++) {
                    if (sellPrices[i] - sellPrices[i - (j + 1)] > bestDiff) {
                        bestDiff = sellPrices[i] - sellPrices[i - (j + 1)];
                    }
                }
            }

            System.out.println(bestDiff);
        }
    }
}
