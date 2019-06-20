package P1;

import java.util.Random;
import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the matrix:");
        int size = scan.nextInt();

        int[][] numbers1 = new int[size][size];
        int[][] numbers2 = new int[size][size];
        int[][] result = new int[size][size];

        Random random = new Random();

        // Fill Matrix 1
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers1[i][j] = random.nextInt(100);
            }
        }

        // Fill Matrix 2
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers2[i][j] = random.nextInt(100);
            }
        }

        // Sum Matrix 1 and Matrix 2
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = numbers1[i][j] + numbers2[i][j];
            }
        }

        System.out.println("===== Matrix 1 =====");
        for (int[] number : numbers1) {
            for (int num : number) {
                System.out.print(num + "\t\t");
            }
            System.out.println();
        }
        System.out.println("====================");

        System.out.println("===== Matrix 2 =====");
        for (int[] number : numbers2) {
            for (int num : number) {
                System.out.print(num + "\t\t");
            }
            System.out.println();
        }
        System.out.println("====================");

        System.out.println("====== Result ======");
        for (int[] number : result) {
            for (int num : number) {
                System.out.print(num + "\t\t");
            }
            System.out.println();
        }
        System.out.println("====================");
    }
}
