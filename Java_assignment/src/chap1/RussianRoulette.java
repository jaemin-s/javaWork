package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {
	static boolean Bang(int bullet) {
		int rd = (int)(Math.random()*6);
		if(rd<=bullet) {
			return true;
		}else {
			return false;
		}
	}
	static String[] RmSIdx(String[] arr,int idx) {
		String[] temp = new String[arr.length-1];
		for(int i=0;i<temp.length;i++) {
			if(i<idx) {
				temp[i]=arr[i];
			}else {
				temp[i]=arr[i+1];
			}
		}
		arr = temp;	temp = null;
		return arr;
	}
	static boolean[] RmbIdx(boolean[] arr,int idx) {
		boolean[] temp = new boolean[arr.length-1];
		for(int i=0;i<temp.length;i++) {
			if(i<idx) {
				temp[i]=arr[i];
			}else {
				temp[i]=arr[i+1];
			}
		}
		arr = temp;	temp = null;
		return arr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==========Russican Routlette!==========");
		int numPP = 0;
		int numBL = 0;

		while(true) { //사람 수 입력
			System.out.print("사람 수(2~4): ");
			numPP = sc.nextInt();
			if(numPP<2||numPP>4) {
				System.out.println("잘못된 입력입니다. 종료합니다");
				sc.close();
				return;
			}else {
				break;
			}
		} //사람 수 입력 종료

		String[] names = new String[numPP];
		for(int i=0;i<names.length;i++) { //사람 이름 입력 시작
			System.out.print("이름: ");
			names[i] = sc.next();

		} //사람 이름 입력 종료

		while(true) { //총알 개수 입력
			System.out.print("총알 개수(1~5): ");
			numBL = sc.nextInt();
			if(numBL<1||numBL>5) {
				System.out.println("잘못된 입력입니다. 종료합니다");
				sc.close();
				return;
			}else {
				break;
			}
		} //사람 수 입력 종료
		boolean[] checkBang = new boolean[numPP];
		while(true) { // 게임 시작
			System.out.println("\n----------");
			System.out.print("남은 인원: ");
			System.out.println(Arrays.toString(names));
			System.out.println("남은 총알: "+numBL);
			System.out.println("----------\n");
			sc.nextLine();

			int numRD;
			while(true) { // 쏠 사람 정하기 시작
				numRD = (int)(Math.random()*(numPP));
				if(!checkBang[numRD]) { // 총쏜 적이 없다면
					break;
				}
			} // 쏠 사람 정하기 끝
			
			System.out.println(Arrays.toString(checkBang)); // 확인용 출력
			System.out.println(names[numRD]+" 차례입니다");
			System.out.println("격발하려면 enter를 누르세요");
			sc.nextLine();

			if(Bang(numBL)) { // 총알이 있으면
				System.out.print(names[numRD]+"이(가) 죽었습니다.");
				numPP--;
				numBL--;
				names = RmSIdx(names,numRD); checkBang=RmbIdx(checkBang,numRD);
			} else { // 총알이 없으면
				System.out.print(names[numRD]+"이(가) 살았습니다.");
				checkBang[numRD]=true;
			}
			
			if(numPP==1||numBL==0) { // 종료 조건 시작
				System.out.println("게임이 끝났습니다");
				System.out.println("\n==========");
				System.out.println(Arrays.toString(names)+"이(가) 이겼습니다");
				System.out.println("==========");
				break; 
			} // 종료 조건 끝
			
			// 격발 확인 시작
			boolean flag = false;
			for(int i=0;i<numPP;i++) { 
				if(!checkBang[i]) { //안 쏜 사람이 있으면 플래그 뒤집기
					flag = true;
				}
			}
			if(!flag) { // 안 쏜 사람이 아무도 없으면 초기화
				for(int j=0;j<numPP;j++) {
					checkBang[j]=false;
				}
			}
			//격발 확인 끝
			
		} // 게임 종료

		sc.close();
	}

}
