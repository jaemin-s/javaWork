package oop.poly;

public class Player {
	String name;
	int level;
	int atk;
	int hp;
	
	Player(){
		level = 1;
		atk = 3;
		hp = 50;
	}
	
	Player(String name){
		this();
		this.name = name;
	}
	
	Player(String name, int hp){
		this(name); 
		this.hp = hp;
	}

	void characterInfo() {
		System.out.println("=====캐릭터 정보=====");
		System.out.println("아이디: "+name);
		System.out.println("레벨: "+level);
		System.out.println("공격력: "+atk);
		System.out.println("체력: "+hp);
	}
	
	void attack(Player target) {
		
		if(this==target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
		System.out.printf("%s(이)가 %s(을)를 공격합니다\n",this.name,target.name);
		
		target.hp -= 10;
		this.hp +=5;
		System.out.printf("나의 체력: %d, 상대방 체력: %d\n",this.hp,target.hp);
	}
	
	
	
	
	
}
