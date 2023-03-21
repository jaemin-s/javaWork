
package basic.datatype;

public class integerExample {

	public static void main(String[] args) {
		
		/*
		 * 리터럴: 변수에 저장되기 전의 상수값
		 * 자바의 정수 리터럴 타입은 int라서
		 * int보다 더 큰 범위의 수를 표현하기 위해서는 L을 붙여서
		 * long타입으로 인식시켜야됨
		 */
		
		byte a = 127; // byte는 -128~127 
		short b = 32767;
		int c = 2147483647; 
//		long d = 2147483648; 
		// java의 기본 정수형이 int라서 2147483648을 표현하지 못함
		long d = 2147483648L; // L(숫자1과 구분하기 위해 대문자 사용)
		
		
	}

}
