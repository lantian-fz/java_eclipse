package test_24;

public class test {

	public static void main(String[] args) {
		Undergraduate under1 = new Undergraduate();
		
		under1.school="�����ƾ���ѧ";
		under1.studentNumber=17059906;
		under1.gender="���꼶";
		under1.birthdate= "1998��6��1��";
		under1.name="����";
		under1.score=89;
		under1.department="��ϢѧԺ";
		under1.major="�������";
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
