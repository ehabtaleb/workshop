/**
 * 
 */
package algo;

import java.util.Random;
/**
 * @author ehab
 *
 */
public class Shuffler {
	
	private static int[] origin = new int[20]; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		init(origin);
		print(origin);
		shuffle(origin);
		print(origin);

	}

	private static void shuffle(int[] origin2) {
		Random r = new Random();
		for(int i = 0;i < origin.length; i++){
			int idx = r.nextInt(origin.length - i) + i;
			int tmp = origin[i];
			origin[i] = origin[idx];
			origin[idx] = tmp;
		}
		
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
			origin[i] = r.nextInt(20)+1;
		}
	}

}
