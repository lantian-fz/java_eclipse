package test_26;

class GrandFather{
	public void show() {
		System.out.println("���Ǡ���");
	}
}
class Father extends GrandFather{
	public void method() {
		System.out.println("��������");
	}
}
public class test1 {

	public static void main(String[] args) {
		Father f = new Father();
		f.show();
	}
}
