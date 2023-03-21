package etc.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {

		/*
		문자를 써서 저장할 대 사용하는 클래스 FileWriter
		기본적으로 2바이트 단위로 처리하기 때문에 문자 쓰기에 적합
		 */
		FileWriter fw = null;

		try {
			fw = new FileWriter("C:\\jm_work\\file\\hi.txt");

			// \r: 캐리지 리턴 > 커서를 맨 앞으로 땡기는 동작
			// \n: 줄 개행
			// 상황과 환경에 따라서 줄 개행 시 커서를 맨 앞으로 안땡겨주는 경우가 있다(rinux)
			String str = "오늘은 3월 14일\r\n화요일입니다\r\n집에 가고 싶다";

			fw.write(str);

			System.out.println("파일이 정상적으로 저장되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
