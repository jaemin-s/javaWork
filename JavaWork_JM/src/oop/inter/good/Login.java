package oop.inter.good;

public class Login implements IUserService {

	@Override
	public void exe() {
		System.out.println("사용자의 id,pw를 받고, DB와 비교 등등...");
	}

}
