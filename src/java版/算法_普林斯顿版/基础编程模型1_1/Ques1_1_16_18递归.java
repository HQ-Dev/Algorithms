package java版.算法_普林斯顿版.基础编程模型1_1;

/**
  * @ClassName: Ques1_1_16_递归
  * @Description:
  * @author i码士技术部-huang
  * @date 2017年04月07日 下午07:21:40
 */
public class Ques1_1_16_18递归 {

    public static void main(String[] args) {
//        exR1(6);
//        exR2(3);  // stackOverFlowError
        System.out.println(mystery(2,25));
        System.out.println(mystery(3,11));
    }

    // 给出 exR1(6) 的返回值
    public static String exR1(int n) {

        if (n <= 0) return "122222";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

    // 找出以下递归函数的问题
    public static String exR2(int n) {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) return "";
        return s;
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }
    

}
