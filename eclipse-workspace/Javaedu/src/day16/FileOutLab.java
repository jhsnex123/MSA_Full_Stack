package day16;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {

	public static void main(String[] args) {

		String path = "C:/Temp";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
		try (FileWriter writer = new FileWriter("C:/Temp/event.txt"); // (String, boolean)
			PrintWriter out = new PrintWriter(writer);) {
			LocalDate ld = LocalDate.of(2024, 10, 3);
			int yearNum = ld.getYear();
			int monthNum = ld.getMonthValue();
			int dateNum = ld.getDayOfMonth();
			DayOfWeek day = ld.getDayOfWeek();
			
			out.printf(" %d년 %d월 %d일은 %s요일입니다.\r\n", yearNum, monthNum, dateNum, day); // printWriter는 FileWriter보다 다양한 포멧 문자를 출력할
																				// 수 있다.

			LocalDate ld2 = LocalDate.of(2024, 12, 25);
			int yearNum2 = ld2.getYear();
			int monthNum2 = ld2.getMonthValue();
			int dateNum2 = ld2.getDayOfMonth();
			DayOfWeek day2 = ld2.getDayOfWeek();

			out.printf(" %d년 %d월 %d일은 %s요일입니다.\r\n", yearNum, monthNum, dateNum, day);
			
			System.out.println("저장이 완료되었습니다.");
		} catch (Exception tp) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}

	}

}
