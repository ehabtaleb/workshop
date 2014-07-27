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
		int [] sub = findMaxSubArray(origin);
		print(sub);

	}
	
	private static int[] findMaxSubArray(int[] origin) {
		int max = 0;

		int[] maxSub = new int[origin.length];
		for(int i = 0; i < origin.length; i++){
			int[] sub = new int [i+1];
			int sum = 0;
			for(int j = 0; j <= i; j++){
				if(origin[j] < 0)
					break;
				sub[j] = origin[j];
				sum += origin[j];
			}
			if(sum > max){
				max = sum;
				maxSub = sub;		
			}
			print(maxSub);
		}
		
		return maxSub;
	}

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
