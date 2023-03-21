package basic.array;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
//		배열(array)
//		같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형
		
		int max=0;
		int min=0;
//		1. 배열 변수의 선언
		int[] arr; //java style
		int arr2[] = new int[9]; //c style
		
//		2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
//		생성할 때 배열의 크기를 정해야 함
		arr = new int[100];
		
//		3. 배열의 초기화 - 배열 내부에 실제 값들을 저장
//		배열의 초기화는 인덱스를 통해 수행
//		인덱스란 배열 내부의 위치를 지정할 수 있는 값
//		인덱스는 0부터 시작하여 1씩 순차적으로 증가
//		배열명[인덱스] = 입력값;
		
//		4. 배열의 총 크기(길이) 확인 >> 배열명.length
		System.out.println(arr.length);
		
//		5. 배열의 저장된 값을 참조(사용)하는 법 배열명[인덱스]
		
//		6. 배열의 반복문 처리
//		배열은 인덱스 번호를 제어변수로 활용하여 쉽게 반복문을  처리할 수 있다
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int) ((Math.random()*100)+1);
			System.out.println("arr["+i+"]= "+arr[i]);
			if(i==0) {
				max=arr[0]; min=arr[0];
				continue;
			}
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("max: "+max+"min: "+min);
		
//		7. 배열 내부의 요소값을 문자열 형태로 한눈에 출력
		System.out.println(Arrays.toString(arr));
		
//		8. 배열의 선언과 생성을 동시에. 각 타입의 기본값으로 자동 초기화 됨
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));

//		9. 배열의 생성과 동시에 초기화도 진행하는 방법
		char[] letters = new char[] {'a', 'b', 'c', 'd'};
		System.out.println(Arrays.toString(letters));
		
//		선언과 동시에 초기화를 할 때
//		딱 한번만 가능한 문법
//		배열은 크기가 고정이기 때문에 늘어나거나 줄어들 수 없다
//		기존의 배열은 조작할 수 없고 새로 생성해야 한다
		
		String[] names = {"철수", "철수2", "철수3"};
//		names = {"철수", "철수2", "철수3"}; (x)
		names = new String[] {"철수4", "철수5", "철수6", "철수7"};
		System.out.println(Arrays.toString(names));
		
		
		
		
		
		
		
		
		
	}
}
