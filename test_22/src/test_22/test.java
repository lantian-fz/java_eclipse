package test_22;

import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file.txt");
		fw.write("hellp world");
		fw.close();
		
//		FileWriter fp = new FileWriter("file2.txt",true);//���ļ�����׷��
//		fp.write("abc ");
//		fp.write("def");
////		fp.close();
//		fp.write(" sakdf");		
//		fp.close();
		FileWriter fw2 = new FileWriter("file3.txt");
		fw2.write("����\n");
		fw2.write("����");
		fw2.close();
		
		FileWriter fw3 = new FileWriter("file4.txt");
		//write�ļ���������ʽ
		fw3.write(20013);
		fw3.write("\n");
		
		fw3.write("abc");
		fw3.write("\n");
		
		fw3.write("hellp world!", 1, 6);//���±�Ϊ1��ʼ��6��
		fw3.write("\n");
		
		fw3.write("hellp world!", 0, 7);
		
		fw3.close();
	} 
}
