package test_9;
import java.util.Scanner;
//��10 �����������ֵ��
public class test {
	
	public static void main(String[] args)
	{
		int[] arr1 = new int[10];
		int max;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������10������:");
		for(int i=0;i<10;i++)
		{
			arr1[i] = sc.nextInt();
		}
		max=arr1[0];
		
		for(int i=0;i<10;i++)
		{
			if(max<arr1[i])
				max=arr1[i];
		}
		
		System.out.print("10������������ = "+max);
		
	}
}
