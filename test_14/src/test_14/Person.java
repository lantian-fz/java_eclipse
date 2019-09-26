package test_14;

public class Person {

	String name;
	private int age;
	
	public void show() {
		System.out.println("名字："+name+", 年龄："+age+"岁");
	}
	
	public void setAge(int num) {
		//这样可以对age进行限制
		if(num>0&&num<120)
			age=num;
		else
			System.out.println("数据有误");
	}
	
	public int getAge() {
		return age;
	}
}
