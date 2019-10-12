package test_18;

public class test {

	public static void main(String[] args) {
		String str = "hellp";
		System.out.println(str);
		
		char[] arr1 = {'h','e','l','l','p',' ','w','o','r','l','d'};
		String str1 = new String(arr1);
		System.out.println(str1);
		String str2 = new String(arr1,3,5);//从下标为3的元素开始的5个元素
		System.out.println(str2);
		System.out.println("=================================");
		char[] arr2 = {'a','b','c'};
		String str4 = new String(arr2);
		String str3 = "abc";
		System.out.println(str4==str3);
		System.out.println(str3.equals(str4));
	}
}
