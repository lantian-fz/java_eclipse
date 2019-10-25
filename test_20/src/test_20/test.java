package test_20;

public class test {

	public static void main(String[] args) {
		String str1 = "how do you do?";
		String str2 = str1.replace("o","*");//将所有 o 替换为 *   返回一个字符串
		System.out.println(str2);
		
		String str3 = "aaa,bbb,ccc,ddd,eeeee";
		String[] arr1 = str3.split(",");//分割函数  但不能使用 英文的句号 如果非要使用，就用"\\."
		//如果非要使用英文的句号  应该这样用  "\\."
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
