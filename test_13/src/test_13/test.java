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
		
		System.out.println("++++++++++++++++++++++++");
		Student stu2=stu1;
		stu2.name = "��";
		stu2.age = 20;
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		stu2.call(stu2.name);
		stu1.name="��";
		System.out.println(stu2.name);
		stu2.name="��";
		System.out.println(stu1.name);
	}
}
