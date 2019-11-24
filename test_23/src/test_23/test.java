package test_23;

public class test {

	public static void main(String[] args) {
		int[] my_num = {1,2,3};
		try {
			System.out.println(my_num[10]);
		} catch(Exception e) {
			System.out.println("ÓĞ´íÎó");
		} finally {
			System.out.println("aaa");
			
		}
	}
}
