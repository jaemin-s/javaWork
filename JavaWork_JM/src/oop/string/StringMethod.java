package oop.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "Hello java";
		
		//charAt(index): 문자열 인덱스에 따른 단일 문자 반환
		System.out.println(str.charAt(6));
		
		//substring(begin, end): 문자열을 범위 지정하여 추출. begin이상 end미만
		System.out.println(str.substring(6,9));
		System.out.println(str.substring(6));//하나만 입력시 입력값 부터 끝까지
		
		//length(): 문자열의 총 길이 반환
		System.out.println(str.length());
		
		//indexOf(str): 해당 문자가 있는 인덱스를 반환. 문자가 없으면 -1을 리턴
		System.out.println(str.indexOf("a"));
		//lastIndexOf(str): 뒤에서 부터의 인덱스를 셈
		System.out.println(str.lastIndexOf("a"));
		
		System.out.println(str.indexOf("ava")); //문자열 입력시 시작 인덱스 반환
		
		//일괄 대소문자 변경
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//trim(): 문자열의 앞, 뒤 공백을 제거
		String str2 = "\n		공	백	";
		System.out.println(str2.trim());
		
		//replace(old, new): 문자열 내부의 old를 모두 찾아서 new로 일괄 변경
		System.out.println(str.replace("l", "i"));
		System.out.println(str.replace("l", ""));
		
		//split: 문자열을 구분자로 구분하여 분할
		//분할된 문자들은 String 배열에 담아서 리턴
		String str3="010-1234-5678";
		System.out.println(Arrays.toString(str3.split("-")));
		
		//문자열의 기본타입 변환 기본타입.parse기본타입(문자열) 
		String str4="153489762";
		System.out.println(Integer.parseInt(str4)-99);
		String str5="3.141592";
		System.out.println(Double.parseDouble(str5)*2);
		String str6="true";
		if(Boolean.parseBoolean(str6)) {
		System.out.println("ok");
		}
		//정수의 문자열 변환 valueOf: 기본 타입을 문자열로 변경
		System.out.println(String.valueOf(124)+String.valueOf(623));
		
		
		
	}

}
