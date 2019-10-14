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
		
		System.out.println("=================================1");
		char[] arr2 = {'a','b','c'};
		String str4 = new String(arr2);
		String str3 = "abc";
		System.out.println(str4==str3);//比较的str4和str3的地址是否相同，若相同，则为true,不同为false
		System.out.println(str3.equals(str4));//比较两个字符串的内容是否相同，与地址无关
		
		System.out.println("=================================2");
		System.out.println("abc".equals(str3));//推荐使用这种写法
		System.out.println(str3.equals("abc"));//虽然是对的，但在str3为空时会报错
		String str5=null;
//		System.out.println(str5.equals("abc"));//空指针没有对象
		System.out.println("abc".equals(str5));//不会报错
		
		System.out.println("=================================3");
		String str6 = "AbC";
		String str7 = "abc";
		System.out.println(str6.equals(str7));
		System.out.println(str6.equalsIgnoreCase(str7));//不区分大小写，但是类型必须是String型
	}
}
