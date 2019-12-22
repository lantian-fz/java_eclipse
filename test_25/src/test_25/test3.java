package test_25;
class GrandFather{
	public void show() {
		System.out.println("我是爺爺");
	}
}

class Father extends GrandFather{
	public void method() {
		System.out.println("我是老子");
	}
}
public class test3 {
	public static void main(String[] args) {
		Penguin p = new Penguin("ksdkf",12);
		p.equals(5);
	}
}
