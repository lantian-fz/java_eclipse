package test_15;

public class test {

	public static void main(String[] args) {
//		Penson pen = new Penson();
		
//		pen.name="蓝天";
		
//		pen.Print("鲲");
		
		System.out.println("-------------------");
		code_1 one = new code_1();
		code_1 two = new code_1(5,6);
		code_1 three = new code_1("蓝天");
		System.out.println("-------------------");
		Penson four = new Penson("蓝天天",21);
		four.show();
		four.setName("鲲");
		four.setAge(28);
		four.show();
	}

}
