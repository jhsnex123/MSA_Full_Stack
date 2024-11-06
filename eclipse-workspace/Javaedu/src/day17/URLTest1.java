package day17;

import java.io.InputStream;
import java.net.URL;

public class URLTest1 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1171062000");
		InputStream is = url.openStream(); // URL의 왠만한 기능이 다 들어가있음 (openStream) --> 문자스트림 -->inputStream
		int input;
		while (true) {
			input = is.read();
			if (input == -1)
				break;
			System.out.print((char)input);
		}

	}

}
