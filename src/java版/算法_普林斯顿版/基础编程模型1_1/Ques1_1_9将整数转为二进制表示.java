package java版.算法_普林斯顿版.基础编程模型1_1;

import java.util.Scanner;

public class Ques1_1_9将整数转为二进制表示 {

	public static void main(String[] args) {
	    String string = "";
	    Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    for (int i = N; i > 0; i /= 2) {
	    	string = (i % 2) + string;
	    }
	      
	    System.out.println(string);
	    in.close();
	}

}
