package test_20;

public class test {

	public static void main(String[] args) {
		String str1 = "how do you do?";
		String str2 = str1.replace("o","*");//������ o �滻Ϊ *   ����һ���ַ���
		System.out.println(str2);
		
		String str3 = "aaa,bbb,ccc,ddd,eeeee";
		String[] arr1 = str3.split(",");//�ָ��  ������ʹ�� Ӣ�ĵľ�� �����Ҫʹ�ã�����"\\."
		//�����Ҫʹ��Ӣ�ĵľ��  Ӧ��������  "\\."
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
