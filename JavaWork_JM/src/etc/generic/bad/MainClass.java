package etc.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
/*
		Object타입으로 선언하면 무엇이든 저장할 수 있지만
		반대로 저장했던 값을 꺼내올 때는 타입별로 일일히 형변환을 해야한다
		
		
 */
		
		
		Box box = new Box();
		box.setObj("홍길동");
		
		Box box2 = new Box();
		box2.setObj("김철수");
		
		System.out.println(((String)box.getObj()).charAt(2));
		
		if(box.getObj().equals(box2.getObj())) {
			System.out.println("같은 이름");
		} else {
			System.out.println("다른 이름");
		}
		
		
	}

}
