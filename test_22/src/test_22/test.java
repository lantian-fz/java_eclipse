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
////		FileWriter fp = new FileWriter("file2.txt",true);//在文件后面追加
////		fp.write("abc ");
////		fp.write("def");
//////		fp.close();
////		fp.write(" sakdf");		
////		fp.close();
//		FileWriter fw2 = new FileWriter("file3.txt");
//		fw2.write("张三\n");
//		fw2.write("李四");
//		fw2.close();
//		
//		FileWriter fw3 = new FileWriter("file4.txt");
//		//write的几种重载形式
//		fw3.write(20013);
//		fw3.write("\n");
//		
//		fw3.write("abc");
//		fw3.write("\n");
//		
//		fw3.write("hellp world!", 1, 6);//从下标为1开始的6个
//		fw3.write("\n");
//		
//		fw3.write("hellp world!", 0, 7);
//		
//		fw3.close();
//		
//		System.out.println("-----------------------------------------");
		
		FileReader fw5 = new FileReader("file4.txt");
		
		int ch = fw5.read();//read()函数返回值为整型，为对应字符的ASCII或者是Unicode数值
		System.out.println(ch);//字符  '中'
		
		ch = fw5.read();
		System.out.println(ch);//字符 '\n'
		
		ch = fw5.read();
		System.out.println(ch);//字符 'a'
		
		ch = fw5.read();
		System.out.println(ch);//字符 'b'
		
		ch = fw5.read();
		System.out.println(ch);//字符 'c'
		
		ch = fw5.read();
		System.out.println(ch);//字符 '\n'
		
		fw5.close();
		
		System.out.println("-----------------------------------------");
		
		FileReader fw6 = new FileReader("file5.txt");
		
		int ch2 = fw6.read();
		System.out.println(ch2);
		
		ch2 = fw6.read();
		System.out.println(ch2);
		
		ch2 = fw6.read();
		System.out.println(ch2);//读取文件结束 输出 -1
		
		ch2 = fw6.read();
		System.out.println(ch2);//读取文件结束 输出 -1
		
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
