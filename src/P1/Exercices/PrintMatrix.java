package P1.Exercices;//import java.util.Random;

import java.util.Scanner;

public class PrintMatrix {

    public static void main(String[] args) {
        int[][] numbers = new int[3][5];

        leer(numbers);

    }

    static void leer(int[][] numbers) {
//        Random random = new Random();
        System.out.println("Enter 15 numbers: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = scan.nextInt();
            }
        }

        visualizar(numbers);
    }

    static void visualizar(int[][] numbers) {
        System.out.println("==========");
        for (int[] number : numbers) {
            for (int num : number) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("==========");
    }
}
