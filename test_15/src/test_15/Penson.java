package test_15;

public class Penson {
//	String name;
	private String name;
	private int age;
	
	
	public void Print(String name) {
		System.out.println("名字1："+name+",名字2："+this.name);
	}
	
	public Penson(String name,int age) {
//		System.out.println("名字："+name+"，年龄"+age);
		this.name=name;
		this.age=age;
	}
	
	public void show() {
		System.out.println("名字："+name+"，年龄"+age);
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
