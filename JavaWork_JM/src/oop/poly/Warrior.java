package oop.poly;


public class Warrior extends Player {
	
	int rage;
	
	Warrior(String name) {
		super(name);
		this.rage = 60;
	}
	
	public void rush(Player target) {
		
/*
	전사의 고유 기능인 rush 메서드를 작성합니다.
	- rush의 대상은 모든 직업들 입니다.
	- 만약 rush의 새당이 전사라면 10의 피해를 받고,
	마법사라면 20의 피해를 받고, 사냥꾼은 15의 피해를 받습니다.
	- 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요
	- 남은 체력도 출력해주세요
	- main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해주세요
 */
		
		
		
		if(this.equals(target)) {
			System.out.println("본인에게 사용할 수 없는 기술입니다.");
			return;
		}else if(target instanceof Warrior) {
			System.out.printf("%s의 rush!\n",this.name);
			target.hp -= 10;
			System.out.printf("%s(은)는 10의 피해를 받았다.\n",target.name);
		}else if(target instanceof Mage) {
			System.out.printf("%s의 rush!\n",this.name);
			target.hp -= 20;
			System.out.printf("%s(은)는 20의 피해를 받았다.\n",target.name);
		}else if(target instanceof Hunter) {
			System.out.printf("%s의 rush!\n",this.name);
			target.hp -= 15;
			System.out.printf("%s(은)는 15의 피해를 받았다.\n",target.name);
		}else {
			return;
		}
		System.out.printf("%s의 남은체력: %d\n",target.name,target.hp);
		System.out.println();
		return;
		
	}
	
	
	void characterInfo() {
		super.characterInfo();
		System.out.println("분노: "+rage);
	}


}
