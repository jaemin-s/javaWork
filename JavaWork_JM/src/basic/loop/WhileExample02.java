package basic.loop;

public class WhileExample02 {

	public static void main(String[] args) {
		
//		48 ~ 150 사이 정수 중 8의 배수만 가로로 출력
		
		int n = 48;
		
		while(n<=150) {
			if(n%8==0) {
				System.out.print(n+" ");				
			}
			n++;
		}
		
		System.out.println();
		
//		1 ~ 100 까지의 정수 중 4의 배수이면서 8의 배수는 아닌 수를 가로로 출력
		
		int j = 1;
		
		while(j<=100) {
			if(j%4==0&&j%8!=0) {
				System.out.print(j+" ");
			}			
			j++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
