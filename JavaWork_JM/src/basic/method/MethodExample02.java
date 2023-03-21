package basic.method;

public class MethodExample02 {
	
	/*
	 
	 매개 변수(parameter, argument)
	 
	 1. 매개변수는 메서드를 호출할 때, 메서드 실행에 필요한 값들을
	 	매서드 내부로 전달하는 매개체 역할을 합니다.
	 	
 	 2.	매서드 호출부에서 어떤 매개값을 전달하느냐에 따라
 		메서드의 실행 결과는 달라질 수 있습니다.
 		
	 3. 매개값을 몇 개 받아서 사용할지는 메서드를 선언할 때 선언부에서
	 	()안에 미리 개수와 타입을 지정합니다.
	 	
 	 4. 매개변수의 이름을 지을 때는 호출자가 선언부로 돌아와서 매개값을
 	 	확인하지 않게, 어떠한 값을 담는 변수인지 그 뜻을 알기 쉽게
 	 	지어주면 서로에게 좋습니다.
	 
	 5. 매개변수를 하나도 선언하지 않을 수도 있습니다. 이 때는 메서드의 선언부에
	 	() 내부를 비워둡니다. 그리고 호출할 때도 ()를 비워서 호출합니다.
	 	
	 
	 */
	
//	가변인수(가변 파라미터)를 사용한 매개변수 작성.
//	콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 내부로 전달합니다.
	static int calcNumberTotal2(int... nums) {
		int total = 0;
		for(int i=0;i<nums.length;i++) {
			total+=nums[i];
		}
		return total;
		
	}
	
	static int calcRangeTotal(int start,int end) {
//		x부터 y까지의 누적합계를 구하는 메서드
		int total = 0;
		for(int i=start;i<=end;i++) {
			total += i;
		}
		return total;
	}
	
	static String selectRandonFood() {
		double rn = Math.random();
		if(rn > 0.66) {
			return "치킨";
		} else if(rn > 0.33) {
			return "족발";
		} else {
			return "삼겹살";
		}
	}
	
	static int calcNumberTotal(int[] nums) {
		int total = 0;
		for(int i=0;i<nums.length;i++) {
			total+=nums[i];
		}
		return total;
	}

	public static void main(String[] args) {
		
		System.out.println(calcRangeTotal(101, 200));
		
		System.out.println(selectRandonFood());
		
		int[] arr = {1,5,94,31,4651,132856,23,6};
		System.out.println(calcNumberTotal(arr));
		
		System.out.println(calcNumberTotal2(arr));
		System.out.println(calcNumberTotal2(123,513,561,321658,2346,-1321,1456));
//		
		System.out.println(calcNumberTotal(new int[] {27,64,32,18,31,42}));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
