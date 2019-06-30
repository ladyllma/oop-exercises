import java.util.stream.IntStream;

public class SortMethods {

//    private static int size = 10;
//    private static int[] numbers = new int[size];
//
//    public static void main(String[] args) {
//        Random random = new Random();
//
//        for (int i = 0; i < size; i++) {
//            numbers[i] = random.nextInt(100);
//        }
//
//        for (int number : numbers) {
//            System.out.print(number + "\t");
//        }
//
//        insertionSort(numbers);
//
//        for (int number : numbers) {
//            System.out.print(number + "\t");
//        }
//    }


    public int[] insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }

        return numbers;
    }

    public int[] bubbleSort(int[] numbers) {
        int n = numbers.length;
        IntStream.range(0, n - 1)
                .flatMap(i -> IntStream.range(1, n - i))
                .forEach(j -> {
                    if (numbers[j - 1] > numbers[j]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j - 1];
                        numbers[j - 1] = temp;
                    }
                });
        return numbers;
    }

    public int[] quickSort(int[] numbers, int a, int b) {
        numbers = new int[numbers.length];
        int buf;
        int from = a;
        int to = b;
        int pivot = numbers[(from + to) / 2];
        do {
            while (numbers[from] < pivot) {
                from++;
            }
            while (numbers[to] > pivot) {
                to--;
            }
            if (from <= to) {
                buf = numbers[from];
                numbers[from] = numbers[to];
                numbers[to] = buf;
                from++;
                to--;
            }
        } while (from <= to);
        if (a < to) {
            quickSort(numbers, a, to);
        }
        if (from < b) {
            quickSort(numbers, from, b);
        }
        return numbers;
    }
}
