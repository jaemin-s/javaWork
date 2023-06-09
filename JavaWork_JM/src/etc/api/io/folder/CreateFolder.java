package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
/*
		자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용합니다
		생성자의 매개값으로 폴더를 생성할 경로+폴더명을 지정합니다
 */
		File file = new File("C:\\jm_work\\folder_test");
		
		
		if(!file.exists()) { //해당 파일 및 폴더가 존재하면 true, 존재하지 않으면 false
			file.mkdir(); //폴더 하나만 생성
			//file.mkdirs(); //지정 경로에 존재 하지 않는 폴더 모두 생성
			System.out.println("폴더 생성 완료");
		} else {
			System.out.println("해당 폴더가 존재 합니다");
		}
		
	}

}
