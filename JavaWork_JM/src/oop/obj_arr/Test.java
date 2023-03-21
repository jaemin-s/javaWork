package oop.obj_arr;

import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("^[가-힣]*$", "가나다"));
		System.out.println(Pattern.matches("^[가-힣]*$", "가2다"));
		System.out.println(Pattern.matches("^[가-힣]*$", "가ㄱ다"));
		String s = "가나다라마바사아";
		System.out.println(s.length());
	}

}
