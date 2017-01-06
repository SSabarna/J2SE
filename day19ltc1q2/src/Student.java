
public class Student {
		protected String name;
		protected String id;
		protected int age;
		protected double grade;
		protected String address;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getGrade() {
			return grade;
		}
		public void setGrade(double grade) {
			this.grade = grade;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Student(){
			
		}
		public Student(String name, String id, int age, double grade, String address) {
			super();
			this.name = name;
			this.id = id;
			this.age = age;
			this.grade = grade;
			this.address = address;
		}
		public boolean isPassed()
		{
			if(grade>50)
				return true;
			else
				return false;
		}
		
		public void display()
		{
			//System.out.println("Student Details");
			System.out.println("Name : "+name);
			System.out.println("Id : "+id);
			System.out.println("Age : "+age);
			System.out.printf("Grade : %.1f\n",grade);
			System.out.println("Address : "+address);
		}
	}
