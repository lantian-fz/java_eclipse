package test_13;

public class Student {

	String name;
	int age;
	
	public void eat(){
		System.out.println("吃饭！");
	}
	
	public void sleep(){
		System.out.println("睡觉");
	}
	
	public void study(){
		System.out.println("学习");
	}
	
	public void call(String str) {
		System.out.println("给"+str+"打电话");
	}
}
