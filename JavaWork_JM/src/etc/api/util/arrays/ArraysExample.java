package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		//배열의 복사
		char[] arr = {'J','A','V','A'};
		char[] arr2 = Arrays.copyOf(arr, arr.length);
		char[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//배열의 탐색: binarySearch(배열, 검색할 값);
		//반드시 정렬이 선행되어야 합니다.
		int[] numbers = {1,3,5,7,9,11,13};
		System.out.println(Arrays.binarySearch(numbers, 5));
		
		//배열의 정렬 
		int[] nums = {25,7,15,893,1896,4187,3,84,913};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//배열 내부 요소가 동일한지 여부를 확인
		System.out.println(Arrays.equals(arr, arr3));
	}

}
