package basic.array;

import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {

		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */

		//		사람 수 입력 >> 사람 이름 입력 >> 총알 수 입력 
		//		>> 무작위 순서로 누르면 격발 >> 한명남으면 게임 끝 
		Scanner sc = new Scanner(System.in);

		while(true) { // Start mainMenu
			System.out.println("==========Russian Roulette==========");
			System.out.print("사람 수를 적어주세요(2~4): ");
			int playerNum;
			int bulletNum;
			boolean[] bulletPos = new boolean[6];
			while(true) { // 사람수 입력 반복
				playerNum = sc.nextInt(); // numPP : 사람 수
				if(playerNum<2||playerNum>4) { // 2~4입력 시에만 넘어가기
					System.out.println("다시 입력해주세요(2~4): ");
				}else {
					break;
				}
			} // 사람수 입력 반복 끝

			String[] playerName = new String[playerNum];
			for(int i=0; i<playerNum;i++) {// 플레이어 등록
				System.out.print((i+1)+"번 플레이어 이름: ");
				playerName[i]=sc.next();
			}

			System.out.print("총알 수를 입력해주세요(1~5): ");
			intputBullet: while(true) { // 총알 입력 반복
				bulletNum = sc.nextInt();
				if(bulletNum<1||bulletNum>5) { // 총알 수 잘못 입력시
					System.out.println("다시 입력해주세요(1~5): ");
					continue intputBullet;
				}else {
					break;
				}
			} // 총알 입력 반복 끝
			int bulletCount =0;
				while(true) {//입력 한 총알 수 까지 랜덤위치에 총알 넣기
					int temp = (int)(Math.random()*5);
					if(!bulletPos[temp]) {
						bulletPos[temp]=true;
						bulletCount++;
					}
					if(bulletCount==bulletNum) {
						break;
					}
				} // 총알 넣기 끝


				sc.nextLine();
			System.out.println("\n\nRussian Roulette Start!!");
			boolean[] bangCheck = new boolean[playerNum]; 
			game: while(true) { // start game
//				System.out.println(Arrays.toString(bulletPos)); // 탄창 확인용
//				System.out.println(Arrays.toString(bangCheck)); // 쐈던 기록 확인
				boolean flag=false;
				for(int i=0;i<playerNum;i++) {
					if(bangCheck[i] == false) {
						flag = true;
						break;
					}
				}
				if(!flag) {
					for(int i=0;i<playerNum;i++) {
						bangCheck[i]=false;
					}
				}
				System.out.println("--------------------");
				System.out.println("남은 인원 수: "+playerNum);
				System.out.println("남은 총알 수: "+bulletNum);
				System.out.print("생존자 명단:");
				for(int i=0;i<playerNum;i++) {
					System.out.print(" "+playerName[i]);
				}
				System.out.println("\n--------------------");
				
				boolean bulletFlag = false;
				int playerRD;
				while(true) {
					playerRD = (int)(Math.random()*playerNum);
					if(!bangCheck[playerRD]) {
						bulletFlag = true;
						break;
					}
					
				}
				if(bulletFlag) {
					System.out.println(playerName[playerRD]+"의 차례입니다");

					while(true) { // enter 입력 
						System.out.println("발사하려면 Enter를 누르세요");
						sc.nextLine();
//						String input = sc.nextLine();
//						if(input.equals("")) {
							while(true){ // 랜덤 위치에 총알 있으면 쏘기
								int bulletRD = (int)(Math.random()*5);
								if(bulletPos[bulletRD]) {
									System.out.println("Bang!! \n"+playerName[playerRD]+"이(가) 죽었습니다\n");
									bulletNum--;
									bulletPos[bulletRD]=false;
									for(int i=playerRD;i<playerNum-1;i++) {
										playerName[i]=playerName[i+1];
										bangCheck[i]=bangCheck[i+1];
									}
									playerNum--;
									String[] tempName = new String[playerNum];
									boolean[] tempCheck = new boolean[playerNum];
									for(int i=0;i<tempName.length;i++) {
										tempName[i]=playerName[i];
										tempCheck[i]=bangCheck[i];
									}
									playerName=tempName;
									bangCheck=tempCheck;
								}else {
									System.out.println(playerName[playerRD]+"이(가) 살아남았습니다\n");
									bangCheck[playerRD]=true;
									continue game;
								}
								break;
							}
//						}
						break;
					} // end input enter 
				}
				if(playerNum==1) {
					System.out.println("================게임 끝===================");
					System.out.println(playerName[0]+"이(가) 이겼습니다");
					break;
				}else if(bulletNum==0) {
					System.out.println("================게임 끝===================");
					for(int i=0;i<playerNum;i++) {
						System.out.print(playerName[i]+" ");
					}
					System.out.println("이(가) 이겼습니다");
					break;
				} else {
					sc.nextLine();
				}

			} // end game


			break;

		} // End mainMenu 



















		sc.close();

	}

}
