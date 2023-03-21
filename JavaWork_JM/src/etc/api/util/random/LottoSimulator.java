package etc.api.util.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random ran = new Random();
	static int[] count = {0,0,0,0,0,0};
	
	static void auto(List<Integer> arr) {
		arr.removeAll(arr);
		Set<Integer> temps = new HashSet<>();
		while(temps.size()<6) {
			int temp = ran.nextInt(45)+1;
			temps.add(temp);
		}
		for(int i : temps) {
			arr.add(i);
		}
		return;
	}
	
	static int createBonus(List<Integer> arr,int bonus) {
		while(true) {
			int temp = ran.nextInt(45)+1;
			if(!arr.contains(temp)) {
				return bonus = temp;
			}
		}
	}

	static int check(List<Integer> prize,List<Integer> my) {
		int result = 0;
		for(int i=0;i<my.size();i++) {
			if(prize.contains(my.get(i))){
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> prize = new ArrayList<>(); 
		List<Integer> my = new ArrayList<>();
		int bonus = 0;
		auto(prize);
		createBonus(prize,bonus);
		
		while(true) {
			auto(my);
			int result = check(prize,my);
			if(result==6) {
				System.out.print(my);
				System.out.println(" 당첨!");
				break;
			}else if(result==5) {
				if(my.contains(bonus)) {
					System.out.print(my);
					System.out.println(" 2등");
					count[1]++;
				}else {
					System.out.print(my);
					System.out.println(" 3등");
					count[2]++;
				}
			}else if(result==4) {
				System.out.print(my);
				System.out.println(" 4등");
				count[3]++;
			}else if(result==3) {
				System.out.print(my);
				System.out.println(" 5등");
				count[4]++;
			}else {
				count[5]++;
			}
			count[0]++;
		}
		
		System.out.println("===================================");
		System.out.println("당첨 번호: "+prize+" 보너스: "+bonus);
		System.out.println("당첨까지 구매한 복권수: "+count[0]+"\n확률:"
		+String.format("%.8f",1.0/count[0]));
		System.out.println("사용 금액: "+(long)(count[0]/10000)+"만원");
		for(int i=1;i<count.length;i++) {
			System.out.println("--------------------");
			System.out.print((i+1)+"등 "+count[i]+"번\n확률: ");
			System.out.println(String.format("%.8f", +(double)count[i]/count[0]));
		}


	}

}
