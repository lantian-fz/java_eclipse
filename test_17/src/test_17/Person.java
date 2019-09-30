package test_17;

public class Person {

	private String name;
	private int age;
	private boolean ret;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Hellp(String name) {
		System.out.println(name+"你好，我是"+this.name+"，今年"+this.age+"岁");
	}
	

	
	//布尔类型的get需要写成is的
	public boolean isRet() {
		return ret;
	}
	public void setRet(boolean ret) {
		this.ret = ret;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
