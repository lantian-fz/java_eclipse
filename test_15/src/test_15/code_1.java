package test_15;

public class code_1 {

	public code_1() {
		System.out.println("无参的构造方法执行！");
	}
	
	public code_1(String name) {
		System.out.print("有参的构造方法执行！");
		System.out.println("姓名"+name);
	}
	
	public code_1(int x,int y) {
		System.out.print("有参的构造方法执行！");
		System.out.println("最大值 = "+(x>y?x:y));
	}
}
