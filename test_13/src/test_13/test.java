package test_13;
//��Ͷ���ĳ���
public class test {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		
		stu1.name = "������";
		stu1.age = 29;
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		
		stu1.call(stu1.name);
		
		stu1.eat();
	}
}
