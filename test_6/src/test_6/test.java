package test_6;
//����˷��ھ���
public class test {
	public static void main(String[] args)
	{
		int i=0;
		int j=0;
		
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(j+"*"+i+" = "+i*j+" ");
			System.out.println();
		}
	}
}
