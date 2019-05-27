public class Divisible {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int num = 1;
        boolean isAlwaysZero = false;

        // Fill arrays
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //Compare
        while (!isAlwaysZero) {
            num++;
            for (int number : numbers) {
                if (num % number == 0) {
                    isAlwaysZero = true;
                } else {
                    isAlwaysZero = false;
                    break;
                }
            }
        }

        System.out.println("El menor divisible es: " + num);
    }
}
