package test_10;

public class test {
	
	public static void main(String[] args)
	{
		int[] arr1 = new int[3];//动态初始化
		
		arr1[0] = 2;
		arr1[1] = 1;
		arr1[2] = 3;
		for(int i=0;i<3;i++)
			System.out.println(arr1[i]);
		System.out.println(arr1);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
		
		int[] arr2 = new int[] {11, 12, 13};//静态初始化
		for(int i=0;i<3;i++)
			System.out.println(arr2[i]);
		System.out.println(arr2);
		
		int[] arr3 = {41, 52, 36, 24, 23, 5};//简便格式的静态初始化
		for(int i=0;i<arr3.length;i++)
			System.out.println(arr3[i]);
	}

}
