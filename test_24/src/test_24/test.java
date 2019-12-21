package test_24;

public class test {

	public static void main(String[] args) {
		Undergraduate under1 = new Undergraduate();
		
		under1.school="西安财经大学";
		under1.studentNumber=17059906;
		under1.gender="三年级";
		under1.birthdate= "1998年6月1日";
		under1.name="蓝天";
		under1.score=89;
		under1.department="信息学院";
		under1.major="软件工程";
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
