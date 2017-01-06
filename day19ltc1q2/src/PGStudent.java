	class PGStudent extends Student
	{
		private String specialization;
		private int noOfPapersPublished;
		/*FILL CODE HERE*/
		public String getSpecialization() {
			return specialization;
		}
		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		public int getNoOfPapersPublished() {
			return noOfPapersPublished;
		}
		public void setNoOfPapersPublished(int noOfPapersPublished) {
			this.noOfPapersPublished = noOfPapersPublished;
		}
		/*public PGStudent(String specialization, int noOfPapersPublished) {
			super();
			this.specialization = specialization;
			this.noOfPapersPublished = noOfPapersPublished;
		}*/
		PGStudent() {
			// TODO Auto-generated constructor stub
		}
		public PGStudent(String name, String id, int age, double grade,
				String address,String specialization,int noOfPapersPublished) {
			//super(name, id, age, grade, address);
			super();
			this.name = name;
			this.id = id;
			this.age = age;
			this.grade = grade;
			this.address = address;
			this.specialization=specialization;
			this.noOfPapersPublished=noOfPapersPublished;
			// TODO Auto-generated constructor stub
		}
		public boolean isPassed()
		{
			if(grade>70 && noOfPapersPublished>=2 )
				return true;
			else
				return false;
		}
		
		public void display()
		{
			//System.out.println("Student Details");
			System.out.println("Name : "+super.name);
			System.out.println("Id : "+super.id);
			System.out.println("Age : "+super.age);
			System.out.printf("Grade : %.1f\n",super.grade);
			System.out.println("Address : "+super.address);
			System.out.println("Specialization : "+specialization);
			System.out.println("No. of papers published : "+noOfPapersPublished);
		}
		
		
	}
