package basic.begin;

public class Identifier {

	public static void main(String[] args) {
		
//		꼭 지켜야 할 규칙(안 지킬 시 에러가 발생할 수 있습니다.)
//		1. 식별자의 이름은 중복을 허용하지 않습니다.
//		그리고, 대/소문자를 철저하게 구분합니다.
		int age = 55;
		int Age = 4;
		System.out.println(Age);
		System.out.println(age);
		
//		2. 식별자 이름은 숫자로 지정하거나 숫자로 시작할 수 없다.
//		String 451 = "abd"; (x)
//		int 5b = 132; (x)
		int a4 = 434;
		System.out.println(a4);
		
//		3. 식별자 이름에 공백을 포함할 수 없습니다.
//		int my money = 10000; (x)
//		int mymoney = 10000; //가능하시만 가독성이 떨어짐
		int myMoney = 10000; //camel case, 연결단어의 시작을 대문자로 작성
		System.out.println(myMoney);
		
//		4. 식별자 이름에 쓸 수 있는 특수문자는 _(언더바)$(달러)뿐이다 
//		하지만 사용을 권장하지는 않습니다. 사용하기로 약속한 곳이 지정되어 있습니다.
		int $_ = 1541;
		System.out.println($_);
		
//		5. 키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
//		키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자입니다.
//		ex) int, public, class, static...
//		String class = "class"; (x)
		String Class = "Class"; // 가능하지만 권장하지 않음
		String className = "class";
		System.out.println(Class +className);
//		int int = 234; (x)
		
//		6. 한글이나 한자같은 식별자 이름도 지정이 가능합니다.
//		하지만 사용을 권장하지는 않습니다.
		int 나이 = 5;
		String 名 = "철수";
		System.out.println(나이);
		System.out.println(名);
		

		
		
		

	}

}
