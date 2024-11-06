package day16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String args[]) {
		FileWriter writer = null; // object
		String path = "C:/iotest"; // 이게 아까 아규먼트 값준거랑 똑같음 런 컨피레이션? 에서 작성한거랑
		File isDir = new File(path);
		if (!isDir.exists()) {        // !앞에 붙이면 펄스값 바로 쓸수 있음
			isDir.mkdir();
		}
		try {
			writer = new FileWriter("c:/iotest/output.txt"); // overwrite mode --> 기존 내용 파기 그리고 새로운 내용으로 추가      // 파일을 출력모드(output) (문자) -< 파일은 만들수 없어서 미리 파일생성을 하고 해야함
			char arr[] = { '객', '체', '지', '향', '언', '어', ' ',  'J', 'a', 'v', 'a' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\n"); // 직접 개행 문자를 넣어줘야함 그래야 개행처리 가능
			writer.write(arr);
			writer.write("\n");
			writer.write("OCJP 시험 대비");
			writer.write("\n");
			writer.write("우리는 한팀!! 마지막까지 서로 도우며 열심히 합시다!!");
			System.out.println("파일에 출력 완료!!");        //지금은 예외처리 안됨? 출력하는데 이상 없어서 그럼
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {                         // [ try~catch with(같이) resorce ]   try(객체생성문장(new__xxx;...) -< 여러개 주는것도 가능) { --> 이렇게 하면 close 처리를 안해도됨!
				if (writer != null)
					writer.close(); // 외부 자원이랑 연결 되어있으면 프로그램 실행하기전에 close 꼭 해주기! (ex. 윈도우 프로그램 종료 버튼)
			} catch (Exception e) {
				System.out.println("파일을 닫는동안 오류 발생!!");         // close 할 떄도 예외처리 꼭 해야함 ㅠㅠ
			}
		}
	}
}
