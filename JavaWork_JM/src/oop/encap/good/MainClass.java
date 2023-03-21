package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		
		my.setYear(1999);
		my.setMonth(5);
		my.setDay(5);
		System.out.printf("내 생일은 %d년 %d월 %d입니다.\n",my.getYear(),my.getMonth(),my.getDay());
		
		System.out.println();
		MyBirth you = new MyBirth();
		
		you.setYear(1899);
		you.setMonth(13);
		you.setDay(33);
		you.birthInfo();
	}

}
