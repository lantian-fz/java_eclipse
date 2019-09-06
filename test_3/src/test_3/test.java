package test_3;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n=sc.nextInt();
		
		if(n%2==0)
			System.out.println(n+"是奇数");
		else
			System.out.println(n+"是偶数");
	}
}
