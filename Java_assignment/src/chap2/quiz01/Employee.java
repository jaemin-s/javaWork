package chap2.quiz01;

public class Employee extends Person{

	private String departments;
	public Employee(String name, int age, String departments) {
		super(name, age);
		this.departments = departments;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	@Override
	public String info() {
		return super.info()+"부서: "+departments;
	}
	
	
}
