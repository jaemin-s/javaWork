package chap2.quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", 30, "a001");
		Teacher tea1 = new Teacher("김철수", 50, "수학");
		Employee emp1 = new Employee("박영희", 25, "영업부");
		
		
		System.out.println(stu1.info());
		System.out.println(tea1.info());
		System.out.println(emp1.info());
		

	}

}
