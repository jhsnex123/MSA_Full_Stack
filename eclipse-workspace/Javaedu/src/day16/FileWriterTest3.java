package day16;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileWriterTest3 {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
		try (FileWriter writer = new FileWriter("C:/iotest/today.txt", true); //(String, boolean)
			  PrintWriter out = new PrintWriter(writer);) {             //printWriter는 FileWriter로 연결시켜서 객체기능을 쓸 수 있음(파이프)
			LocalDate ld = LocalDate.now();
			int yearNum = ld.getYear();
			int monthNum = ld.getMonthValue();
			int dateNum = ld.getDayOfMonth();
			DayOfWeek day = ld.getDayOfWeek();
			String korday = day.getDisplayName(TextStyle.FULL, Locale.KOREAN);

			out.printf("오늘은 %d년 %d월 %d일입니다.\r\n", yearNum, monthNum, dateNum); //printWriter는 FileWriter보다 다양한 포멧 문자를 출력할 수 있다.
			out.printf("오늘은 %s입니다.\r\n", korday);

			LocalDate myld = LocalDate.of(1996, 2, 22);
			DayOfWeek myday = myld.getDayOfWeek();
			String mykorday = myday.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			out.printf("%s은 %s에 태어났습니다.%n", "XXX", mykorday);
			System.out.println("저장이 완료되었습니다.");

		} catch (Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}
}