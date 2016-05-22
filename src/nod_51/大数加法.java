package nod_51;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class 大数加法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();  // 需要读入字符串
		String b = scanner.next();
		
		// 大数相加，构建每一个大数用字符串参数
		BigDecimal bigDecimal1 = new BigDecimal(a);
		BigDecimal bigDecimal2 = new BigDecimal(b);
		
		System.out.println(bigDecimal1.add(bigDecimal2));
		
		scanner.close();
	}

}
