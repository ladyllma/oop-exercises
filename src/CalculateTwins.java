import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CalculateTwins {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        Utils utils = new Utils();
        int initNumber;
        int finishNumber;

        System.out.println("Enter init number: ");
        initNumber = scan.nextInt();

        System.out.println("Enter finish number: ");
        finishNumber = scan.nextInt();

        IntStream.range(initNumber, finishNumber).forEach(numbers::add);

        numbers.forEach(number -> {
            int actualNumber = number;
            int nextNumber = number + 2;

            if(utils.areTwins(actualNumber, nextNumber)){
                System.out.println(actualNumber + " & " + nextNumber + " are twins.");
            }
        });
    }
}
