package algo;

public class CalcPrimeNumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {

        final int numberOfPrimes = 10;
        int[] primes = new int[numberOfPrimes];
        primes[0] = 3;
        for (int i = 2, j = 1; j < numberOfPrimes; i++) {
            if (isprime(primes, i)) {
                primes[j++] = i;
            }
        }
        print(primes);

    }

    private static boolean isprime(int[] primes, int i) {
        if(i % 2 == 0)
            return false;
        for (int p : primes) {
            if (p == 0)
                break;
            if (i % p == 0)
                return false;
        }
        return true;
    }

    private static void print(int[] arr) {
        StringBuilder buff = new StringBuilder(arr.length + 1);
        for (int i : arr) {
            buff.append(i + ",");
        }
        buff.setLength(buff.length() - 1);
        System.out.print(buff.toString());

    }

    /**
     * @param i
     * @return
     */
    private static boolean isMultipleOf(int i, int cont) {
        return i % cont == 0;
    }

}
