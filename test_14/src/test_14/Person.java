package test_14;

public class Person {

	String name;
	private int age;
	
	public void show() {
		System.out.println("���֣�"+name+", ���䣺"+age+"��");
	}
	
	public void setAge(int num) {
		//�������Զ�age��������
		if(num>0&&num<120)
			age=num;
		else
			System.out.println("��������");
	}
	
	public int getAge() {
		return age;
	}
}
