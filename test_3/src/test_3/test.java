package test_3;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		int n=sc.nextInt();
		
		if(n%2==0)
			System.out.println(n+"������");
		else
			System.out.println(n+"��ż��");
	}
}
