package java版.算法_普林斯顿版.基础编程模型1_1;

/*
 * 如果double类型的变量x和y都严格位于0和1之间则打印true,否则打印false
 */
public class Ques1_1_5IsBetweenZeroAndOne {

	public static void main(String[] args) {
		trueOrFalse();
	}
	
	public static void trueOrFalse() {
		double x = Math.random() * 2;
		double y = Math.random() * 2;
		
		System.out.println(String.format("x = %f , y = %f", x, y));
		System.out.println(( x < 1 && y < 1 ) ? "true" : "false");
	}

}
