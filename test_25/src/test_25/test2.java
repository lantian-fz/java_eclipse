package test_25;

import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0;i<10;i++)
		{
			arr.add(i);
		}
		System.out.println(arr);
		arr.add(1,100);//���±�Ϊ1��λ�ò���Ԫ��100
		System.out.println(arr);
		
		arr.remove(2);//ɾ���±�Ϊ2��Ԫ��
		System.out.println(arr);
		
		System.out.println(arr.size());
		int x=arr.get(1);
		System.out.println(x);
		arr.clear();
		System.out.println(arr);
	}
}
