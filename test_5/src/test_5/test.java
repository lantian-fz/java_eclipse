package test_5;
//��ӡ100~200֮������� 
public class test {
	public static void main(String[] args) 
	{
		int i=0;
		int j=0;
		
		for(i=100;i<200;i++)
		{
			for(j=2;j<=i-1;j++)
				if(i%j==0)
					break;
			if(i==j)
				System.out.println(i+"������");
		}
	}
}
