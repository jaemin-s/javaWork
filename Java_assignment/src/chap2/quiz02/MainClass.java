package chap2.quiz02;


public class MainClass {

	public static void main(String[] args) {
//		Main 메서드에서 Car 객체를 적절한 모델명과 함께 생성합니다.
		Car myCar = new Car("Porsche 911");
	
//		시동을 걸지 않은 상태에서 속도를 올려 봅니다.
		myCar.setSpeed(100);
		System.out.println(myCar.getSpeed());
		System.out.println("---------------------------");
		
//		그 후 시동을 걸고 변속기를 D 모드로 지정한 후 속도를 100까지 올립니다.
		myCar.engineStart();
		System.out.println(myCar.isStart());
		myCar.setMode('D');
		System.out.println(myCar.getMode());
		myCar.setSpeed(100);
		System.out.println(myCar.getSpeed());
		System.out.println("---------------------------");
		
//		속도가 100인 상태에서 시동을 한 번 꺼 봅니다.
		myCar.engineStop();
		System.out.println("---------------------------");
		
//		속도를 완전히 줄인 후 변속기를 P 모드로 지정하고 시동을 끕니다.
		myCar.setSpeed(0);
		System.out.println(myCar.getSpeed());
		myCar.setMode('P');
		System.out.println(myCar.getMode());
		myCar.engineStop();
		System.out.println(myCar.isStart());
		
//		캡슐화 테스트
//		myCar.moveCylinder(); //(x)
//		myCar.injectOil(); //(x)
//		myCar.injectGasoline(); //(x)
//		myCar.speed = 50; //(x)
		

	}

}
