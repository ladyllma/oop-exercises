import java.util.Scanner;

public class RomanNumber {

    public static void main(String[] args) {
        Utils utils = new Utils();
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("Enter a number to convert it into Roman Number: ");
        n = scan.nextInt();

        System.out.println("=====================");
        System.out.println(n + " in roman is... " + utils.toRomanNumber(n));
    }
}
