package etc.api.lang.math;

public class MathQuiz {
	
	static int page(int i) {
		return (int)Math.ceil(i*0.1);
		
	}

	public static void main(String[] args) {
		
/*
  		1~10이 전달되면 1이 반환되고,
  		11~20이 전달되면 2가 반환되고,
  		21~30이 전달되면 30이 반환되고,...
  		이러한 로직을 수행하는 static 메서드 page를 선언해 보세요
 */
		
		System.out.println(page(15));
		System.out.println(page(64));
		System.out.println(page(26));
		System.out.println(page(84));
		System.out.println(page(35));
		System.out.println(page(60));

	}

}
