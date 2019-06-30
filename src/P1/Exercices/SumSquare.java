package P1.Exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SumSquare {

    public static void main(String[] args) {

        int sumOfSquare = 0;
        double squareOfSums;
        List<Integer> numbers = new ArrayList<>();

        IntStream.range(1, 100).forEach(numbers::add);

        for (int number : numbers) {
            sumOfSquare += Math.pow(number, 2);
        }
        squareOfSums = Math.pow(numbers.stream().mapToInt(Integer::intValue).sum(), 2);

        System.out.println("Sum of squares: " + sumOfSquare);
        System.out.println("Square of sums: " + squareOfSums);
        System.out.println("The difference is: " + (squareOfSums - sumOfSquare));
    }
}
