
class UGStudent extends Student
{
	private String degree;
	private String stream;
	/*FILL CODE HERE*/
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	/*public UGStudent(String degree, String stream) {
		super();
		this.degree = degree;
		this.stream = stream;
	}*/
	UGStudent() {
		// TODO Auto-generated constructor stub
	}
	public UGStudent(String name, String id, int age, double grade,
			String address,String degree,String stream) {
		super();
		//super(name, id, age, grade, address);
		this.name = name;
		this.id = id;
		this.age = age;
		this.grade = grade;
		this.address = address;
		this.degree=degree;
		this.stream=stream;
		// TODO Auto-generated constructor stub
	}
	public boolean isPassed()
	{
		if(grade>70)
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
		System.out.println("Degree : "+degree);
		System.out.println("Stream : "+stream);
	}
	
}