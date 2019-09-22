package test_13;
//类和对象的尝试
public class test {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		
		stu1.name = "蔡徐坤";
		stu1.age = 29;
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		
		stu1.call(stu1.name);
		
		stu1.eat();
	}
}
