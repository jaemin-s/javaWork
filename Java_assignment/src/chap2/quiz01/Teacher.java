package chap2.quiz01;

public class Teacher extends Person{

	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String info() {
		return super.info()+"과목: "+subject;
	}
	
	
}
