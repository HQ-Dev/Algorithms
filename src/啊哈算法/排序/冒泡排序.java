package 啊哈算法.排序;

import java.util.Arrays;
import java.util.Scanner;

public class 冒泡排序 {

	/*
	 * 冒泡排序
	 * 基本思想：每次比较两个相邻的元素，如果他们的顺序错误，就把他们交换过来。
	 * 
	 *     例如有五个数从大到小排序。我们将每一个数归位将其称为“一趟”。“冒泡排序”的
	 * 原理是：每一趟只能确定将一个数归位。
	 *     总结一下：如果有 n 个数进行排序，只需将 n - 1 个数归位，也就是说要进行 n-1 趟
	 * 操作。而“每一趟”都需要从第 1 位开始进行相邻两个数的比较，将较小的一个数放到
	 * 后面，比较完毕后向后挪一位继续比较相邻两个数字的大小，重复此步骤，直到最后一个尚为
	 * 归位的数，已经归位的数字无需进行比较。
	 * 
	 */
	public static void main(String[] args) {
		// 调用冒泡排序算法
		method1();
	}
	
	/*
	 * method1 用来纯粹比较给定数字的大小并进行排序
	 */
	public static void method1() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("请确定你接下来想比较多少个数字的大小？");
		int numCount = in.nextInt();
		System.out.println("输入你的数字：");
		
		// 1. 在console中依次输入将要被比较的数字并放入一个数组中
		int[] numArray = new int[numCount];
		for (int i = 0; i < numCount; i++) {
			numArray[i] = in.nextInt();
		}
		
		// 打印将要进行排序的数组
		System.out.println("before: " + Arrays.toString(numArray));
		
		// 2. 冒泡排序算法的核心：对相邻位置的数字一次进行比较，然后“归位”
		for (int i = 0; i < numCount - 1; i++) { // 共需进行 numCount -1 次归类
			for (int j = 1; j < numCount - i; j++) { // j < numCount - i; 表示每次“归类”需要进行的比较次数
				if (numArray[j-1] < numArray[j]) {
					int temp = numArray[j-1];
					numArray[j-1] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		
		// 打印排序好的数组
		System.out.println("after: " + Arrays.toString(numArray));
		
		in.close();
		
	}

}










