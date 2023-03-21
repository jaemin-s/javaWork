package basic.method;

public class MethodExample01 {
	
//	메서드의 선언 = static (내보내려는 값의 타입) (메서드 이름)((입력 받은 값을 저장할 변수)) {
//		(대충 함수)
//		return (내보낼 값의 변수);
//	}
	static int calcTotal(int x) {
		int total = 0;
		for(int i=1; i<=x;i++) {
			total +=i;
		}
		return total;
	}
	
	static boolean bang(int numBullet) {
		int maxBullet = 6;
		boolean flag = false;
		int rd = (int)(Math.random()*maxBullet);
		if(rd<=numBullet) flag=true;
		return flag;
	}

	public static void main(String[] args) {
		
		int bullet = 3;
		System.out.println(bang(bullet)?"Bang":"Alive");
		
		/*
		 # 메서드 (method)
		 
		 - 메서드는 반복되는 코드 블록에 이름을 붙여놓은 것입니다.
		 
		 - 메서드는 반복되는 코드를 줄여주고
		  좀 더 구조화 시켜서 우리가 코드를 알아보기 쉽게 합니다. (코드의 모듈화)

		 - 메서드는 선언하는 과정과 호출하는 과정으로 나누어집니다.
		 
		 - 메서드의 선언은 메서드 내부에서는 불가능합니다. 새로운 메서드의 선언은
		  반드시 메서드 블록 외부 and 클래스 블록 내부에서만 가능합니다.

		 - 메서드의 호출은 메서드나 생성자 내부에서만 가능합니다.
		 
		 - 메서드의 호출은 곧 메서드를 사용하는 것을 의미하며,
		 1. 메서드가 필요로 하는 데이터(매개값)를 호출부에서 전달하면
		 2. 그 값을 받아서 메서드 내부로 전달하고, 로직이 실행됩니다.
		 3. 실행 결과값을 메서드를 호출한 곳으로 다시 반환합니다.
		 4. 반환된 값은 변수에 담아서 저장하거나, 출력하는 등 다양하게 활용합니다.
		 */

	}

}
