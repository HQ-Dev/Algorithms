package java版.算法_普林斯顿版.基础编程模型1_1;

import java.util.Scanner;

import edu.princeton.cs.algs4.StdOut;

public class Test {

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

