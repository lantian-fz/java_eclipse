package test_8;
import java.util.Scanner;
//�����������α�����ֵ��������ֵ�����ݽ��н����� 
public class test {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,tmp;
		System.out.print("������a = ");
		a=sc.nextInt();
		System.out.print("������b = ");
		b=sc.nextInt();
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("������a = "+a+",b = "+b);
	}
}
