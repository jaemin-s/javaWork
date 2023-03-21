package chap1;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		String[] arr = {"가", "나", "다", "라", "마"};
		int idx = 3;
		String[] temp = new String[arr.length-1];
		for(int i=0;i<temp.length;i++) {
			if(i<idx) {
				temp[i]=arr[i];
			}else {
				temp[i]=arr[i+1];
			}
		}
		arr = temp;	temp = null;
		
		System.out.println(Arrays.toString(arr));

	}

}
