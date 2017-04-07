package java版.算法_普林斯顿版.基础编程模型1_1;

import edu.princeton.cs.algs4.StdOut;

/**
  * @ClassName: Ques1_1_19_Fibonacci
  * @Description:
  * @author i码士技术部-huang
  * @date 2017年04月07日 下午08:05:45
 */

/*
 * 计算机用这段程序在一个小时内能够得到 F(N) 结果的最大 N 值是多少？
 * 开发 F(N) 的一个更好的实现，用数组保存已经计算过的值
 */
public class Ques1_1_19_Fibonacci {

    public static long F(int N) {

        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    public static void main(String[] args) {

        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + F(N));
        }
    }
}
