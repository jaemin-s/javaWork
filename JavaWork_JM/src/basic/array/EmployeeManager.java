package basic.array;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//		사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		int idx=0;
		//		실제로 입력된 데이터(사원의 정보)의 개수
		int count=0;

		//				for(int test=1;test<100;test++) {
		//					userNums[count]=String.valueOf(test);
		//					names[count]=String.valueOf(test);
		//					ages[count]=test;
		//					departments[count]=String.valueOf(test);
		//					count++;
		//				}

		//		메뉴 기능 : 사원 등록, 모든 사원 정보, 특정 사원 검색, 사원 정보 수정, 메뉴 종료
		menu: while(true){
			//			System.out.println("count: "+count);
			System.out.println("\n============= 사원 관리 프로그램 =================");
			System.out.println("1. 사원 정보 신규 등록");
			System.out.println("2. 모든 사원 정보 보기");
			System.out.println("3. 사원 정보 검색");
			System.out.println("4. 사원 정보 수정");
			System.out.println("5. 사원 정보 삭제");
			System.out.println("6. 프로그램 종료");
			System.out.print("==============================================\n> ");
			String something = sc.next();
			switch(something) {
			case "1":{
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 중복이 발생하면 다시 입력받기.)
				if(count<100) {
					regi :while(true) {
						boolean flag = false;
						System.out.print("사번: ");
						userNums[count] = sc.next();
						for(int i=0;i<count;i++) {
							if(userNums[count].equals(userNums[i])) {
								flag = true;
								System.out.println("중복된 사번입니다.\n");
								break;
							}
						}
						if(!flag) {
							break;
						}else {
							continue regi;
						}
					}
					System.out.print("이름: ");
					names[count] = sc.next(); 
					System.out.print("나이: ");
					ages[count] = sc.nextInt(); 
					System.out.print("부서명: ");
					departments[count] = sc.next(); 
					count++;
					break;
				}else {
					System.out.println("더 이상 등록 할 수 없습니다");
					break;
				}
			} // end 1. 사원 정보 신규 등록
			case "2":{
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				System.out.println();
				if(count==0) {
					System.out.println("등록된 사원 정보가 없습니다");
				}else {
					for(int i=0;i<count;i++) {
						System.out.println("사번: "+userNums[i]);
						System.out.println("이름: "+names[i]);
						System.out.println("나이: "+ages[i]);
						System.out.println("부서명: "+departments[i]+"\n");
					}
				}
				break;
			} // 2. 모든 사원 정보 보기
			case "3":{
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.

				System.out.print("사번: ");
				String inputNum = sc.next();
				boolean flag = false;
				for(int i=0;i<count;i++) {
					if(userNums[i].equals(inputNum)) {
						idx=i;
						flag = true;
					}
				}
				if(flag) {
					System.out.print("\n사번: "+userNums[idx]+"\n");
					System.out.print("이름: "+names[idx]+"\n");
					System.out.print("나이: "+ages[idx]+"\n");
					System.out.print("부서명: "+departments[idx]+"\n\n");
				}else {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}
				break;

			} // 3. 사원 정보 검색
			case "4":{
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.

				System.out.print("사번: ");
				String inputNum = sc.next();
				boolean flag = false;
				for(int i=0;i<count;i++) {
					if(userNums[i].equals(inputNum)) {
						idx=i;
						flag = true;
						break;
					}
				}
				if(flag) {
					System.out.print("\n사번: "+userNums[idx]+"\n");
					System.out.print("이름: "+names[idx]+"\n");
					System.out.print("나이: "+ages[idx]+"\n");
					System.out.print("부서명: "+departments[idx]+"\n\n");
					while(true) {
						System.out.println("1. 나이변경 | 2. 부서변경 | 3.취소");
						String inputNum2 = sc.next();
						if(inputNum2.equals("1")) {
							System.out.print("변경할 나이: ");
							ages[idx] = sc.nextInt();
						}else if(inputNum2.equals("2")) {
							System.out.print("변경할 부서: ");
							departments[idx] = sc.next();
						}else if(inputNum2.equals("3")) {
							break;
						}else {
							System.out.println("잘못 입력했습니다");
						}
					}//바꿀 내용 무한루프
				}else {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}
				break;
			} // 4. 사원 정보 수정
			case "5":{
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.print("사번: ");
				String inputNum = sc.next();
				boolean flag = false;
				for(int i=0;i<count;i++) {
					if(userNums[i].equals(inputNum)) {
						idx=i;
						flag = true;
						break;
					}
				}
				if(flag) {
					delete:while(true) {
						System.out.print("정말 삭제하시겠습니까? [Y/N]: ");
						String inputNum2 = sc.next();
						switch(inputNum2) {
						case "Y": case"y":	{
							for(int i=idx;i<count;i++) {
								if(i==userNums.length-1) {
									userNums[i]=null;
									names[i]=null;
									ages[i]=0;
									departments[i]=null;
								} else {
									userNums[i]=userNums[i+1];
									names[i]=names[i+1];
									ages[i]=ages[i+1];
									departments[i]=departments[i+1];
								}
							}
							count--;
							System.out.println("\n삭제되었습니다\n");
							break;
						}case "N": case"n":	{
							System.out.println("\n취소되었습니다\n");
							break;
						}default:{
							System.out.println("잘못 입력했습니다");
							continue delete;
						}
						}
						break;
					}//바꿀 내용 무한루프
				}else {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}
				break;
			} // 5. 사원 정보 삭제
			case "6":{
				System.out.println("종료합니다");
				break menu;
			} // 6. 프로그램 종료
			default: {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			} // 잘못 입력
			} // end switch
		} // end while



		sc.close();


	}

}
