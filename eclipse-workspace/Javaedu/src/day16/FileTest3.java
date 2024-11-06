package day16;

import java.io.File;
import java.util.Date;

public class FileTest3 {
	public static void main(String[] args) throws Exception {
		File dir = new File(args[0]);  // args[0] 아규먼트 값이 없어서 run 컨피그레이션? 에들어가서 아규먼트 들어가서 c:/Temp 파일을 만들어줘야 실행이됨! 
		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			return;
		}
		long time = new Date().getTime();
		String newFileName = "temp" + time + ".tmp";
		File file = new File(dir, newFileName);
		if (file.createNewFile())
			System.out.println(newFileName + "명의 파일이 생성되었습니다.");
		else
			System.out.println(newFileName + "명의 파일이 이미 존재합니다.");
	}
}
