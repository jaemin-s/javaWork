package basic.method;

import java.util.Arrays;

public class EmployeePractice01 {
	
	static boolean check(String name, String[] names) {
		boolean flag = false;
		for(int i=0;i<names.length;i++) {
			if(name.equals(names[i])){
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	static int fSIdx(String find, String[] arr) {
		int idx = 0;
		for(int i=0;i<arr.length;i++) {
			if(find.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		return idx;
	}

	static String[] checkNidx(String find, String[] arr) {
		boolean flag = false;
		int idx = 0;
		for(int i=0;i<arr.length;i++) {
			if(find.equals(arr[i])){
				flag = true;
				idx = i;
				break;
			}
		}
		
		return new String[] {String.valueOf(flag),String.valueOf(idx)};
	}
	public static void main(String[] args) {
		
		String[] names = {"name1", "name2", "name3"};
		String n1 = "name2";
		String n2 = "name4";
		
		System.out.println(check(n1,names));
		System.out.println(check(n2,names));
		System.out.println(fSIdx(n1,names));
		
		String[] result1 = checkNidx(n1, names);
		String[] result2 = checkNidx(n2, names);
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
		
		int idx=0;
		if(Boolean.parseBoolean(result1[0])) {
			idx = Integer.valueOf(result1[1]);
		}
		
		System.out.println(idx);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
