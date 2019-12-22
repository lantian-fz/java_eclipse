package test_26;

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
public class test1 {

	public static void main(String[] args) {
		Father f = new Father();
		f.show();
	}
}
