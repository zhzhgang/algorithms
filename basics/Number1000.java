package basics;

import java.util.Scanner;


/**
 * 
 * <p>Title: 1000 A + B</p>
 * <p>Description: ���� 2 ������ A �� B�������������ĺ͡�</p>
 * <p>Input: 2������A B���м��ÿո�ָ��0 <= A, B <= 10^9��</p>
 * <p>Output: ���A + B�ļ�������</p>
 * <p>Input example: 1 2</p>
 * <p>Output example: 3</p>
 * @author zhzhgang
 * @date 2017��4��22�� ����10:51:24
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
