class Utils {
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
}
