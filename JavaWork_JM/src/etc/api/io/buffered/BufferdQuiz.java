package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferdQuiz {

	public static void main(String[] args) {

		/*
        1. Date클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20230314file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
        4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
		 */

		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		Scanner sc = new Scanner(System.in);

		File f = new File("C:\\jm_work\\file\\"+date.format(dtf)+"file");

		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String root = null;;
		try {
			if(!f.exists()) {
				f.mkdir();
				System.out.println("폴더 생성 완료");
			}else {
				System.out.println("폴더가 이미 존재합니다");
			}
			System.out.print("파일명을 입력하세요: ");
			String fileName = sc.nextLine();
			root = "C:\\jm_work\\file\\"
					+date.format(dtf)+"file\\"+fileName+".txt"; 
			fw = new FileWriter(root);
			bw = new BufferedWriter(fw);
//			bw = new BufferedWriter(new FileWriter(root));
			System.out.println("내용을 입력하세요: ");
			while(true) {
				String strW = sc.nextLine();
				if(strW.equals("그만")) {
					System.out.println("종료합니다");
					break;
				}
				bw.write(strW+"\n");
			}



		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


		try {
			fr = new FileReader(root);
			br = new BufferedReader(fr);

			String strR;
			while((strR=br.readLine())!=null) {
				System.out.println(strR);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}


	}

}
