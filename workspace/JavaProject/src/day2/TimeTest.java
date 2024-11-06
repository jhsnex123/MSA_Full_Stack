package day2;

public class TimeTest {

	public static void main(String[] args) {
		int time = 32150;
		int hour = time/3600;
		
		hour = time-32142;
		int time1 = 32150;
		int minute;
		
		minute = time1 - 32095;

		int time2= 32150;
		int second;
		
		second = time2 - 32100;
		
		System.out.print(hour + " 시간");
		System.out.print(minute + " 분");
		System.out.print(second + " 초");
	}

}
