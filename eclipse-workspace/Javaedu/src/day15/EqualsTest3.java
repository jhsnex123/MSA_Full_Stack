package day15;
import java.util.Date;
class Value {
	int value;
	Value(int value) {
		this.value = value;  
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof Value)
			if (value == ((Value)obj).value)
				result = true;
		return result; 
	}
}

public class EqualsTest3 {
	public static void main(String[] args) {
		Value v1 = new Value(10);              
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null)); 				//false          
		System.out.println(v1.equals(v3)); 				//false				equals object 을 쓰면 등가연산자 기능으로 변환
		System.out.println(v1.equals(v2)); 				//true	
		System.out.println(v1.equals(new Date()));    //false

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다."); //true(출력)
		else
			System.out.println("v1과 v2는 다릅니다."); //f 
		v2 = v1;
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");//true(출력)
		else
			System.out.println("v1과 v2는 다릅니다.");//f
	}
}
