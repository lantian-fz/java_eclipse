package test_25;

//import java.util.Scanner;

//abstract class Animal{
//	public abstract void eat();
////	public Animal() {}
//}
////abstract class Dog extends Animal{}
//class Cat extends Animal{
//	public void eat() {
//		System.out.println("aaaaaaaaaa");
//	}
//}
public class test {
	public static int Max(int[] x) {
		int max = x[0];
		for(int n : x) {
			if(n > max)
				max = n;
		}
		return max;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {12,5223,48,663,74,12,72};
		int max = Max(arr);
		System.out.println(max);
//		String str[] = {"dka","ksdfi","wejff"};
//		for(String x:str) {
//			System.out.println(x);
//		}
//		Animal a = new Cat();
//		a.eat();
//		Scanner sc1 = new Scanner(System.in);
//		
//		while(sc1.hasNext())
//		{
//			int score = sc1.nextInt();
//			for(int i=0;i<score;i++) {
//				double a = sc1.nextDouble();
//			}
//		}
		
		
//		boolean a = sc1.hasNextInt();		
//		System.out.println(a);
		
//		String a = sc1.nextLine();//¶ÁÒ»ÐÐ
//		System.out.println(a);
//		int x = sc1.nextInt();
//		System.out.println(x);
//		
//		Scanner sc2 = new Scanner(new BufferedInputStream(System.in));
//		int y =sc2.nextInt();
//		System.out.println(y);
		
//		String z = sc1.next();
//		System.out.println(z);
//		
//		double aa = sc1.nextDouble();
//		System.out.println(aa);
		
	}
}
