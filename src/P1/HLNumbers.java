package P1;

import java.util.Scanner;

public class HLNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the numbers of the array:");

        // Fill Array
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        int lesser = getTheLesser(numbers);
        int higher = getTheHighest(numbers);
        int countL = 0;
        int countH = 0;

        // Verify numbers quantities
        for (int i = 0; i < size; i++) {
            if (numbers[i] == lesser){
                countL++;
            } else if (numbers[i] == higher){
                countH++;
            }
        }

        System.out.println("El mayor es: " + higher + " y se repite: " + countH);
        System.out.println("El menor es: " + lesser + " y se repite: " + countL);

    }

    private static int getTheHighest(int[] numbers) {
        int n = numbers.length;
        int highest = numbers[0];

        for (int i = 1; i < n; i++)
            if (numbers[i] > highest)
                highest = numbers[i];

        return highest;
    }

    private static int getTheLesser(int[] numbers) {
        int n = numbers.length;
        int lesser = numbers[0];

        for (int i = 1; i < n; i++)
            if (numbers[i] < lesser)
                lesser = numbers[i];

        return lesser;
    }
}
