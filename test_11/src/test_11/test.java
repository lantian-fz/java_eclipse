package test_11;
import java.util.Scanner;
public class test {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入两个整数：");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = Sum(x,y);
		System.out.println(x+"+"+y+" = "+sum);
	}
	
	public static int Sum(int a,int b)
	{
		int ret = a + b;
		return ret; 
	}
}
