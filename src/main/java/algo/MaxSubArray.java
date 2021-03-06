/**
 * 
 */
package algo;

import java.util.Random;

/**
 * @author ehab
 *
 */
public class MaxSubArray {
	
	private static final int n = 10;

	private static int[] origin = new int[n]; 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		init(origin);
		print(origin);
		int max = 0;
        int[] sumArr = new int[origin.length];
        sumArr[0] = origin[0];

        for (int i = 1; i < origin.length; i++) {
            sumArr[i] = sumArr[i - 1] + origin[i];

            // for(int j = 0; j <= i; j++){
            // sum += origin[j];
            // }
            System.out.printf("for i %d the sum is %d \n", i, sumArr[i]);
            if (sumArr[i] > max)
                max = sumArr[i];
		}
		System.out.println(max);

	}

    //
    // private static int sumSubArray(int idx, int[] origin) {
    // int sum = 0;
    // for(int i = 0; i <= idx; i++){
    // sum += origin[i];
    // }
    // return sum;
    // }

	private static void print(int[] origin2) {
		for(int i = 0; i < origin.length; i++){
			System.out.print(origin[i]+",");
		}
		System.out.println();
	}

	private static void init(int[] origin) {
		Random r = new Random();
		for(int i = 0; i < origin.length; i++){
			origin[i] = r.nextInt(20)-9;
		}
	}

}
