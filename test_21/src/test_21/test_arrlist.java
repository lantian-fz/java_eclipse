package test_21;

import java.util.ArrayList;//ctrl + shift + o  ������ݼ�

public class test_arrlist {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();//<>��ֻ��ʹ���������� 
		//�������� byte    short   int   long   float   double   char     boolean
		//�������� Byte    Short Integer Long   Float   Double Character  Boolean
		
		System.out.println(list1);
		
		list1.add("abc");
		list1.add("def");
		list1.add("����");
		list1.add("����");
		 
		System.out.println(list1);
		
		String str1 = list1.get(1);
		System.out.println(str1);
		System.out.println("list1���ȣ�"+list1.size());
		list1.add("����");
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
		
		Person per1 = new Person("����",18);
		Person per2 = new Person("����",23);
		Person per3 = new Person("����",21);
		
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
