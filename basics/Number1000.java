package basics;

import java.util.Scanner;


/**
 * 
 * <p>Title: 1000 A + B</p>
 * <p>Description: 给出 2 个整数 A 和 B，计算两个数的和。</p>
 * <p>Input: 2个整数A B，中间用空格分割。（0 <= A, B <= 10^9）</p>
 * <p>Output: 输出A + B的计算结果。</p>
 * <p>Input example: 1 2</p>
 * <p>Output example: 3</p>
 * @author zhzhgang
 * @date 2017年4月22日 上午10:51:24
 */
public class Number1000 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int a = input.nextInt();
		int b = input.nextInt();
		int sum = add(a, b);
		
		System.out.println(sum);
	}
	
	public static int add(int a, int b) {
        return a + b;
    }

}
