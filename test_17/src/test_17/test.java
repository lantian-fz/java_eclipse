package test_17;

public class test {

	public static void main(String[] args) {
		Person lantian = new Person();
		lantian.setName("À¶Ìì");
		lantian.setAge(21);
		
		Person kun = new Person("öï",20);
		
		lantian.Hellp(kun.getName());
		
		kun.Hellp(lantian.getName());
	}
}
