package algo;

public class SpokenNumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {

        final int n = 10;
        int[] arr = new int[n];
        for (int i = 1, j = 0; j < n; i++) {
            if (isMultipleOf(i, 4) && isMultipleOf(i, 7)) {
                arr[j++] = i;
            } else if (isMultipleOf(i, 4))
                continue;
            else if (isMultipleOf(i, 7))
                continue;
            else {
                arr[j++] = i;
            }
        }
        print(arr);

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
