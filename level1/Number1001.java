package level1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 * <p>Title: 1001 数组中和等于K的数对</p>
 * <p>Description: 给出一个整数K和一个无序数组A，A的元素为N个互不相同的整数，找出数组A中所有和等于K的数对。例如K = 8，数组A：{-1,6,5,3,4,2,9,0,8}，所有和等于8的数对包括(-1,9)，(0,8)，(2,6)，(3,5)。</p>
 * <p>Input: 第1行：用空格隔开的2个数，K N，N为A数组的长度。(2 <= N <= 50000，-10^9 <= K <= 10^9)
 *           第2 - N + 1行：A数组的N个元素。（-10^9 <= A[i] <= 10^9) </p>
 * <p>Output: 第1 - M行：每行2个数，要求较小的数在前面，并且这M个数对按照较小的数升序排列。
 *            如果不存在任何一组解则输出：No Solution。</p>
 * <p>Input example: 
 * 8 9
 * -1
 * 6
 * 5
 * 3
 * 4
 * 2
 * 9
 * 0
 * 8
 * </p>
 * <p>Output example: 
 * -1 9
 *  0 8
 *  2 6
 *  3 5
 * </p>
 * @author zhzhgang
 * @date 2017年4月22日 下午12:56:05
 */
public class Number1001 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int k = input.nextInt();
		int n = input.nextInt();
		
		int[] a = new int[n];
		int index = 0;
 		
		while (index < a.length) {
			a[index++] = Integer.parseInt(input.next());
		}
		
		TreeSet<int[]> set = new TreeSet<int[]>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == k) {
					/*if (a[i] < a[j]) {
						set.add(new int[]{a[i], a[j]});
					} else {
						set.add(new int[]{a[j], a[i]});
					}*/
					set.add(a[i] < a[j] ? new int[]{a[i], a[j]} : new int[]{a[j], a[i]});
				}
			}
		}
		
		if (set.isEmpty()) {
			System.out.println("No Solution");
			return;
		}
		
		for (int[] result : set) {
			System.out.println(result[0] + " " + result[1]);
		}
	}

}
