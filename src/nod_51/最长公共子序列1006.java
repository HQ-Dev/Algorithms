package nod_51;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 最长公共子序列1006 {

	public static void main(String[] args) {
		maxLongcs();
	}
	
	static void maxLongcs() {
		Scanner in = new Scanner(System.in);
		
		String aString = in.nextLine();
		String bString = in.nextLine();
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		// 选择以aString为基准进行比较，就将它放入 不可重复的集合中，防止重复字符比较
		Set aSet = new HashSet<>();
		for (int i = 0; i < aString.length(); i++) {
			aSet.add(aString.charAt(i));
		}
		for (Object c : aSet) {
			sb1.append(c);
		}
		aString = sb1.toString();
		
		for(int i = 0; i < aString.length(); i++) {
			for (int j = 0; j < bString.length(); j++) { 
				if (aString.charAt(i) == bString.charAt(j)) {
					sb2.append(aString.charAt(i));
					break; // 在b字符串中找到一个相同的并添加之后就跳出，防止重复添加。
				}
			}
		}
		System.out.println(sb2.toString());
		
		in.close();
	}

}
