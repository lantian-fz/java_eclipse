package test_8;
import java.util.Scanner;
//给定两个整形变量的值，将两个值的内容进行交换。 
public class test {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,tmp;
		System.out.print("请输入a = ");
		a=sc.nextInt();
		System.out.print("请输入b = ");
		b=sc.nextInt();
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("交换后：a = "+a+",b = "+b);
	}
}
