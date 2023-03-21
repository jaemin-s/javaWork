package chap2.quiz01;

public class Student extends Person{

	private String studentId;

	public Student(String name,int age,String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String info() {
		return super.info()+"학번: "+studentId;
	}
	
	

}
