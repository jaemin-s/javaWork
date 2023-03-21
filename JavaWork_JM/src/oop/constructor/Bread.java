package oop.constructor;

import java.util.Arrays;

public class Bread {
	
	Bread(){}
	
	Bread(String bName,int bPrice,String... ingredient){
		name = bName;
		price = bPrice;
		ingredients = ingredient;
		
	}
	
	String name;
	String[] ingredients;
	int price;
	
	void info() {
		System.out.println("빵 이름: "+name);
		System.out.println("빵 가격: "+price+"원");
		System.out.println("빵 재료: "+Arrays.toString(ingredients));
	}

}
