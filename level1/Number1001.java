package level1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 * <p>Title: 1001 �����к͵���K������</p>
 * <p>Description: ����һ������K��һ����������A��A��Ԫ��ΪN��������ͬ���������ҳ�����A�����к͵���K�����ԡ�����K = 8������A��{-1,6,5,3,4,2,9,0,8}�����к͵���8�����԰���(-1,9)��(0,8)��(2,6)��(3,5)��</p>
 * <p>Input: ��1�У��ÿո������2������K N��NΪA����ĳ��ȡ�(2 <= N <= 50000��-10^9 <= K <= 10^9)
 *           ��2 - N + 1�У�A�����N��Ԫ�ء���-10^9 <= A[i] <= 10^9) </p>
 * <p>Output: ��1 - M�У�ÿ��2������Ҫ���С������ǰ�棬������M�����԰��ս�С�����������С�
 *            ����������κ�һ����������No Solution��</p>
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
 * @date 2017��4��22�� ����12:56:05
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
