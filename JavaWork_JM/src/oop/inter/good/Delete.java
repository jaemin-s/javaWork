package oop.inter.good;

public class Delete implements IUserService{

	@Override
	public void exe() {
		System.out.println("사용자의 id를 받아서 DB에서 찾아서 삭제");
		
	}

}
