package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		
		char c = 'B';
		int i = 2;
		
		int intResult = c+i;
		char charResult = (char)(c+i);
//		다른 데이터타입간의 연산 결과는 큰 쪽의 데이터 타입을 가짐
		
		System.out.println(intResult);
		System.out.println(charResult);
		
		int k = 10;
		double d = k/4; // k(int)/4(int)=2(int)
		double d2 = (double)k/4; 
		double d3 = k/4.0; 
		System.out.println(d);
//		int끼리의 연산은 결과는 int값
//		연산값 중 하나를 double로 바꾸면 double로 값이 나옴
		System.out.println(d2);
		System.out.println(d3);
		
		byte b1 = 100;
		byte b2 = 70;
//		java에서 int보다 작은 값끼리의 연산은 자동으로 int로 변환
//		그 값이 범위를 벗어나지 않더라도 int로 됨
		System.out.println(b1+b2);
		
		byte b3 = 4;
		byte b4 = 6;
//		byte b5 = b3+b4;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
