package test_17;

public class test {

	public static void main(String[] args) {
		Person lantian = new Person();
		lantian.setName("����");
		lantian.setAge(21);
		
		Person kun = new Person("��",20);
		
		lantian.Hellp(kun.getName());
		
		kun.Hellp(lantian.getName());
	}
}
