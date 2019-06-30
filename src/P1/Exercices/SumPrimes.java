package P1.Exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SumPrimes {

    public static void main(String[] args) {
        Utils utils = new Utils();
        List<Integer> numbers = new ArrayList<>();

        IntStream.range(1, 1999).forEach(number -> {
            if (utils.isPrime(number)) {
                numbers.add(number);
            }
        });

        System.out.println("The sum is: " + numbers.stream().mapToInt(Integer::intValue).sum());
    }
}
