package Exercices;

class Utils {
//    int bubbleSort(int[] numbers){
//        int aux = 0;
//        int n = numbers.length;
//
//        for (int i = 0; i < n-1; i++)
//            for (int j = 0; j < n-i-1; j++)
//                if (numbers[j] > numbers[j+1])
//                {
//                    aux = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = aux;
//                }
//
//        return aux;
//    }

    boolean isPrime(int n) {
        int h = n / 2;
        boolean flag = true;

        for (int i = 2; i <= h; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    boolean areTwins(int n, int m){
        if (isPrime(n) && isPrime(m)) {
            if (isPrime(n + 2)) {
                return (n + 2) == m;
            }
        }
        return false;
    }

    String toRomanNumber(int n) {
        StringBuilder roman = new StringBuilder();
        int miles, hundred, tens, units;

        miles = n / 1000;
        hundred = n / 100 % 10;
        tens = n / 10 % 10;
        units = n % 10;

        for (int i = 1; i <= miles; i++) {
            roman.append("M");
        }

        if (hundred == 9) {
            roman.append("CM");
        } else if (hundred >= 5) {
            roman.append("D");
            for (int i = 6; i <= hundred; i++) {
                roman.append("C");
            }
        } else if (hundred == 4) {
            roman.append("CD");
        } else {
            for (int i = 1; i <= hundred; i++) {
                roman.append("C");
            }
        }

        if (tens == 9) {
            roman.append("XC");
        } else if (tens >= 5) {
            roman.append("L");
            for (int i = 6; i <= tens; i++) {
                roman.append("X");
            }
        } else if (tens == 4) {
            roman.append("XL");
        } else {
            for (int i = 1; i <= tens; i++) {
                roman.append("X");
            }
        }

        if (units == 9) {
            roman.append("IX");
        } else if (units >= 5) {
            roman.append("V");
            for (int i = 6; i <= units; i++) {
                roman.append("I");
            }
        } else if (units == 4) {
            roman.append("IV");
        } else {
            for (int i = 1; i <= units; i++) {
                roman.append("I");
            }
        }
        return roman.toString();
    }
}
