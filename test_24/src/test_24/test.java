package test_24;

public class test {

	public static void main(String[] args) {
		Undergraduate under1 = new Undergraduate();
		
		under1.school="����";
		under1.studentNumber=161000;
		under1.gender="һ�꼶";
		under1.birthdate= "1999.02.02";
		under1.name="Tom";
		under1.score=99;
		under1.department="�Ź�";
		under1.major="���";
		under1.setName();
		System.out.println("���գ�"+under1.birthdate);
		System.out.println("�꼶��"+under1.gender);
		System.out.println("ѧУ��"+under1.school);
		System.out.println("ѧ�ţ�"+under1.studentNumber);
		under1.setScore();
		under1.setDepartment();
		under1.setMajor();			
	
	}
}
