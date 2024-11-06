package day14;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 v1 = new Value1();
		v1.putData("자바");
		String s1 = v1.getData();
		System.out.println(s1);
		//v1.putData(new Date());         //	String은 상수클래스라 아규먼트값에는 무조건 문자열만 올 수 있음!
		
		Value2 v2 = new Value2();
		v2.putData("자바");
		String s2 = (String)v2.getData();
		System.out.println(s2);
		v2.putData(new Date());
		Date d2 = (Date)v2.getData();
	    System.out.println(d2);		
	    
	  Value3<String> v3 = new Value3<String>();
	  v3.putData("자바");
		String s3 = v3.getData();
		System.out.println(s3);
	  
	  Value3<Date> v4 = new Value3<Date>();
		v4.putData(new Date());
		Date d4 = v4.getData();
	    System.out.println(d4);
	    
	    Value3 v5 = new Value3();
	}
}

class Value1 {
	String data;
	
	void putData(String data) {
		this.data = data;
		
	}
	String getData() {
		return data;
	}
}
class Value2 {
	Object data;
	void putData(Object data) {
		this.data = data;
		
	}
	Object getData() {
		return data;
	}
}

//Value3<String> obj1 = new Value3<String>()
//Value3<Date> obj2 = new Value3<Date>()
class Value3<KJH> { //제너릭스 구문을 쓸때는 꺽새가로 대문자로 넣어여함
	KJH data;
	void putData(KJH data) {
		this.data = data;
		
	}
	KJH getData() {
		return data;
	}
}
