package basic.array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = 6;
		int cntP;
		System.out.println("input Player number(2~4)");
		while(true) {
			cntP = sc.nextInt()	;
			if(cntP>1&&cntP<5) {
				break;
			}
		}

		String[] nameP = new String[cntP];
		for(int i=0; i<cntP;i++) {// 플레이어 등록
			System.out.print((i+1)+"번 플레이어 이름: ");
			nameP[i]=sc.next();
		}
		int bullet;
		System.out.print("input Bullet number(1~5): \n>");
		while(true) {
			bullet = sc.nextInt()	;
			if(bullet>0&&bullet<6) {
				break;
			}
		}

		sc.nextLine();
		int idx = (int)(Math.random()*cntP);
		while(true) {
			System.out.println("input enter");
			sc.nextLine();
			int rd = (int)(Math.random()*(total)+1);
			System.out.println();
			boolean result = false;
			if(rd<=bullet) {
				result = true;
			}
			if(result) {
				System.out.println("Bang "+nameP[idx]+" is die");
				cntP--;
				bullet--;
				String[] nameT = new String[cntP];
				for(int i=idx;i<cntP;i++) {
					nameP[i]=nameP[i+1];
				}
				for(int i=0;i<cntP;i++) {
					nameT[i]=nameP[i];
				}
				nameP=nameT;
				nameT=null;
			}else {
				System.out.println(nameP[idx]+" is Alive");
				if(idx==cntP) {
					idx=0;
				}else {
					idx++;
				}
			}
			System.out.println(bullet+""+cntP);
			if(bullet==0||cntP==1) { // 총알이 떨어졌거나 한명 남으면
				System.out.println("게임이 끝났습니다.");
				for(int i=0;i<cntP;i++) {
					System.out.println(nameP[i]+"은(는) 살아남았습니다");
				}
				break;
			}
		}
		sc.close();
	}
}