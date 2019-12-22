package test_25;
	class Animal{
		private String name;
		private int id;
		
		public Animal(String myname,int myid) {
			this.name=myname;
			this.id=myid;
		}
		
		public void eat() {
			System.out.println(name+"≥‘");
		}
		
		public void sleep() {
			System.out.println(name+"ÀØ");
		}
		
		public void introd() {
			System.out.println("Œ“ «"+id+"Ãñ"+name);
		}
	}

