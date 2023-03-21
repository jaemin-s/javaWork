package basic.loop;

public class WhileQuiz99 {

	public static void main(String[] args) {
		
//		1 ~ 30000 중 258배수의 개수
		
		int n = 30000; 
		int i = 1; 
		int count = 0; 
		
		while(i<=n) {
			if(i%258==0) {
				count++;
			}
			i++;
		}
		
		System.out.println(count);
		
//		1000의 약수의 개수
		
		int n2 = 1000; 
		int i2 = 1; 
		int count2 = 0; 
		
		while(i2<=n2) {
			if(n2%i2==0) {
				count2++;
			}
			i2++;
		}
		
		System.out.println(count2);
		
		

	}

}
