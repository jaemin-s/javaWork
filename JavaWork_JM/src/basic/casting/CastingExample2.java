package basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		int i = 72;
		char c = (char)i; 
		// 큰 타입을 작은 타입으로 대입할 때는 명시적으로 형 변환을 진행해야됨 
		System.out.println(c);
		
		double d = 4.98;
		int j = (int)d; 
		// 변환 과정에서 손실 가능성이 있어 수동으로 써야됨 (overflow, underflow)
		System.out.println(j);
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);
		
				
		
		
		
		
		
		
		
		
		
		

	}

}
