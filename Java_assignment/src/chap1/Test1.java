package chap1;

import java.util.Arrays;

public class Test1 {
	static String[] RmSIdx(String[] arr,int idx) {

		String[] temp = new String[arr.length-1];
		for(int i=0;i<temp.length;i++) {
			if(i<idx) {
				temp[i]=arr[i];
			}else {
				temp[i]=arr[i+1];
			}
		}
		
		arr = temp; temp =null;
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		String[] arr1 = {"가", "나", "다", "라", "마"};
		arr1 = RmSIdx(arr1,3);
		
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		
		

	}

}
