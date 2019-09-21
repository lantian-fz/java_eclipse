package test_12;
//º¯ÊıµÄÖØÔØ
public class test {

	public static void main(String[] args) {
		System.out.println(sum(10));
		System.out.println(sum(10,20));
		System.out.println(sum(10,1,2));
		System.out.println(sum(10,1,2,3));
		
		System.out.println("======================");
		System.out.println(sum(1.5,20));
		System.out.println(sum(10,2.5));
	}
	
	public static int sum(int a) {
		return a;
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public static double sum(double a,int b) {
		return a+b;
	}
	public static double sum(int a,double b) {
		return a+b;
	}
}
