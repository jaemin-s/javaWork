package basic.array;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int[][] arrs = {
				{1,2,3,4},
				{2,3,4,5},
				{5,2,43,5},
				{15,89,32,75}
		};
		
		System.out.println(arrs.length);
		
		System.out.println(Arrays.toString(arrs));
		System.out.println(Arrays.toString(arrs[3]));
		
		System.out.println(arrs[3][1]);
		
		int n = 7;
		String[][] circles = new String[n][n];
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				circles[i][j]="○";
				System.out.print(circles[i][j]+" ");
				if(j==n-1) System.out.println();
			}
		}
		
		System.out.println(Arrays.deepToString(circles));
		
//		빈 2차원 배열 만들기
		int[][] arr2 = new int[3][4];
		System.out.println(Arrays.deepToString(arr2));
		
		arr2[1][2]=50;
		arr2[2][1]=70;
		for(int[] array : arr2) {
			for(int t:array) {
				System.out.print(t+" ");
			}
			System.out.println();
		}
		
		int[][][] poop = new int[3][4][5];
		System.out.println(Arrays.deepToString(poop));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
