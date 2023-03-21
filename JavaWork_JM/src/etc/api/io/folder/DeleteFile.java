package etc.api.io.folder;

import java.io.File;
import java.util.Arrays;

public class DeleteFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\jm_work\\folder_test");
		
//		if(file.exists()) {
//			file.delete(); // delete 성공 시 true, 실패 시 false
//			// 폴더안에 파일이 있으면 삭제 불가
//			System.out.println("삭제 완료");
//		}else {
//			System.out.println("파일 삭제 실패");
//		}
		
		if(file.exists()) {
			if(file.isDirectory()) { //파일이 디렉토리인지 확인
				File[] files = file.listFiles();
				for(int i=0;i<files.length;i++) {
					if(files[i].delete()) {
						System.out.println(files[i].getName()+"삭제성공");
					}else {
						System.out.println(files[i].getName()+"삭제실패");
					}
				}
				
			}
		}
		if(file.delete()) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}

}
