package java版.算法_普林斯顿版.基础编程模型1_1;

import java.util.Scanner;

/*
 * 编写一个程序，从命令行得到三个整数参数。如果他们都相等则打印 equal ,否则打印 not equal 。
 */
public class Ques1_1_3EqualOrNotEqual {

	public static void main(String[] args) {
		equalOrNotEqual();
	}
		
	public static void equalOrNotEqual() {
		Scanner in = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		if (a == b && b == c) {
			System.out.println("equal!");
		} else {
			System.out.println("not equal!");
		}
		
		in.close();
	}
}


