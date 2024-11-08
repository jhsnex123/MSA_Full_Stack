package day17;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLTest2 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1171062000");
		InputStream is = url.openStream();
		Scanner scan = new Scanner(is);           //->스캐너 객체로 써도 한글로 변환 가능!
		while (scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
	}
}