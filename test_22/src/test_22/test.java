package test_22;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		
//		FileWriter fw = new FileWriter("file.txt");
//		fw.write("hellp world");
//		fw.close();
//		
////		FileWriter fp = new FileWriter("file2.txt",true);//���ļ�����׷��
////		fp.write("abc ");
////		fp.write("def");
//////		fp.close();
////		fp.write(" sakdf");		
////		fp.close();
//		FileWriter fw2 = new FileWriter("file3.txt");
//		fw2.write("����\n");
//		fw2.write("����");
//		fw2.close();
//		
//		FileWriter fw3 = new FileWriter("file4.txt");
//		//write�ļ���������ʽ
//		fw3.write(20013);
//		fw3.write("\n");
//		
//		fw3.write("abc");
//		fw3.write("\n");
//		
//		fw3.write("hellp world!", 1, 6);//���±�Ϊ1��ʼ��6��
//		fw3.write("\n");
//		
//		fw3.write("hellp world!", 0, 7);
//		
//		fw3.close();
//		
//		System.out.println("-----------------------------------------");
		
		FileReader fw5 = new FileReader("file4.txt");
		
		int ch = fw5.read();//read()��������ֵΪ���ͣ�Ϊ��Ӧ�ַ���ASCII������Unicode��ֵ
		System.out.println(ch);//�ַ�  '��'
		
		ch = fw5.read();
		System.out.println(ch);//�ַ� '\n'
		
		ch = fw5.read();
		System.out.println(ch);//�ַ� 'a'
		
		ch = fw5.read();
		System.out.println(ch);//�ַ� 'b'
		
		ch = fw5.read();
		System.out.println(ch);//�ַ� 'c'
		
		ch = fw5.read();
		System.out.println(ch);//�ַ� '\n'
		
		fw5.close();
		
		System.out.println("-----------------------------------------");
		
		FileReader fw6 = new FileReader("file5.txt");
		
		int ch2 = fw6.read();
		System.out.println(ch2);
		
		ch2 = fw6.read();
		System.out.println(ch2);
		
		ch2 = fw6.read();
		System.out.println(ch2);//��ȡ�ļ����� ��� -1
		
		ch2 = fw6.read();
		System.out.println(ch2);//��ȡ�ļ����� ��� -1
		
		fw5.close();
		System.out.println("-----------------------------------------");
		
		FileReader fw7 = new FileReader("file4.txt");
		
		int ch3;
		while((ch3=fw7.read()) != -1) {
			System.out.print((char) ch3);
		}
		
		fw7.close();
	} 
}
