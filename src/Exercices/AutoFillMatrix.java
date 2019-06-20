package Exercices;

public class AutoFillMatrix {

    public static void main(String[] args) {
        int size = 5;
        int[][] numbers = new int[size][size];
        int count = 0;

        for (int i = 0; i <= size - 5; i++) {
            for (int j = 0; j < size; j++) {
                numbers[i][j] = count;
                count++;
            }
        }

        count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size - 5; j++) {
                numbers[i][j] = count;
                count++;
            }
        }

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                numbers[i][j] = count;
                count++;
            }
        }

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
