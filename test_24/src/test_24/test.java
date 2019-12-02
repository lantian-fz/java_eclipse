package test_24;

public class test {

	public static void main(String[] args) {
		Undergraduate under1 = new Undergraduate();
		
		under1.school="河南";
		under1.studentNumber=161000;
		under1.gender="一年级";
		under1.birthdate= "1999.02.02";
		under1.name="Tom";
		under1.score=99;
		under1.department="信管";
		under1.major="软件";
		under1.setName();
		System.out.println("生日："+under1.birthdate);
		System.out.println("年级："+under1.gender);
		System.out.println("学校："+under1.school);
		System.out.println("学号："+under1.studentNumber);
		under1.setScore();
		under1.setDepartment();
		under1.setMajor();			
	
	}
}
