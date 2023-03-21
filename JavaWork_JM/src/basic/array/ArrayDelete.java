package basic.array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9,11,13};
//		7을 지우고 싶을 때 뒤의 값들을 당긴다
		
		int n = 1; // n은 삭제하고 싶은 값의 주소
		for(int i=n;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		
		System.out.println("arr: "+Arrays.toString(arr));
		
//		기존의 배열보다 크기가 하나 작은 새 배열 생성
		int[] temp = new int[arr.length-1];
		
		for(int j=0;j<temp.length;j++) {
			temp[j]=arr[j];
		}
		
		System.out.println("temp: "+Arrays.toString(temp));
		
		arr = temp;
		temp = null;
		
		System.out.println("arr: "+Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
