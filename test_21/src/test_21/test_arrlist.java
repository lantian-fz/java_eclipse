package test_21;

import java.util.ArrayList;//ctrl + shift + o  导包快捷键

public class test_arrlist {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();//<>内只能使用引用类型 
		//基本类型 byte    short   int   long   float   double   char     boolean
		//引用类型 Byte    Short Integer Long   Float   Double Character  Boolean
		
		System.out.println(list1);
		
		list1.add("abc");
		list1.add("def");
		list1.add("张三");
		list1.add("李四");
		 
		System.out.println(list1);
		
		String str1 = list1.get(1);
		System.out.println(str1);
		System.out.println("list1长度："+list1.size());
		list1.add("王五");
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		
		System.out.println("\n------------------------------");
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2);
		
		System.out.println("------------------------------");
		
		Person per1 = new Person("张三",18);
		Person per2 = new Person("李四",23);
		Person per3 = new Person("王五",21);
		
		ArrayList<Person> list3 = new ArrayList<>();
		list3.add(per1);
		list3.add(per2);
		list3.add(per3);
//		System.out.println(list3);
		for(int i=0;i<list3.size();i++) {
			System.out.print(list3.get(i).getName()+" "+list3.get(i).getAge()+"  ");
		}
	}
}
