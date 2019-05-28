import java.util.ArrayList;
import java.util.List;

public class SumTwins {

    public static void main(String[] args) {
        Utils utils = new Utils();
        List<Integer> twins = new ArrayList<>();
        int sumTwins;
        int size = 3;
        int[][] numbers = new int[size][size];

        numbers[0][0] = 9;
        numbers[0][1] = 3;
        numbers[0][2] = 10;
        numbers[1][0] = 11;
        numbers[1][1] = 5;
        numbers[1][2] = 4;
        numbers[2][0] = 15;
        numbers[2][1] = 2;
        numbers[2][2] = 13;

        for (int[] number : numbers) {
            for (int num : number) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("=====================");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    for (int l = 0; l < size; l++) {
                        int n = numbers[i][j];
                        int m = numbers[k][l];

                        if (n != m) {
                            if (utils.areTwins(n, m)) {
                                if (!twins.contains(n)) twins.add(n);
                                if (!twins.contains(m)) twins.add(m);
                            }
                        }
                    }
                }
            }
        }

        if (twins.size() != 0) {
            sumTwins = twins.stream().mapToInt(Integer::intValue).sum();

            System.out.println("Total twins found: " + twins.size());
            System.out.println("Twins found: " + twins.toString());
            System.out.println("Sum of all twins: " + sumTwins);
        } else System.out.println("No twins found.");
    }
}
