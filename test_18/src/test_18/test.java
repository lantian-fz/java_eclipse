package test_18;

public class test {

	public static void main(String[] args) {
		String str = "hellp";
		System.out.println(str);
		
		char[] arr1 = {'h','e','l','l','p',' ','w','o','r','l','d'};
		String str1 = new String(arr1);
		System.out.println(str1);
		String str2 = new String(arr1,3,5);//���±�Ϊ3��Ԫ�ؿ�ʼ��5��Ԫ��
		System.out.println(str2);
		
		System.out.println("=================================1");
		char[] arr2 = {'a','b','c'};
		String str4 = new String(arr2);
		String str3 = "abc";
		System.out.println(str4==str3);//�Ƚϵ�str4��str3�ĵ�ַ�Ƿ���ͬ������ͬ����Ϊtrue,��ͬΪfalse
		System.out.println(str3.equals(str4));//�Ƚ������ַ����������Ƿ���ͬ�����ַ�޹�
		
		System.out.println("=================================2");
		System.out.println("abc".equals(str3));//�Ƽ�ʹ������д��
		System.out.println(str3.equals("abc"));//��Ȼ�ǶԵģ�����str3Ϊ��ʱ�ᱨ��
		String str5=null;
//		System.out.println(str5.equals("abc"));//��ָ��û�ж���
		System.out.println("abc".equals(str5));//���ᱨ��
		
		System.out.println("=================================3");
		String str6 = "AbC";
		String str7 = "abc";
		System.out.println(str6.equals(str7));
		System.out.println(str6.equalsIgnoreCase(str7));//�����ִ�Сд���������ͱ�����String��
	}
}
