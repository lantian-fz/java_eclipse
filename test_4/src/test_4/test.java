package test_4;
import java.util.Scanner;
//比较两个数大小，输出较大数
public class test 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x>y)
			System.out.println(x);
		else if(x<y)
			System.out.println(y);
		else
			System.out.println(x);
		
	}
}
