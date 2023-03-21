package oop.inter.good;

public class Join implements IUserService{

	@Override
	public void exe() {
		System.out.println("회원 가입 로직이 실행됨");
		System.out.println("DB접속, 입력값 가져옴, 값 집어넣음 등등...");
	}

}
