package day14;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		System.out.println(list);
		list.add(2, "키위");    // 번호 지정에 따른 삽입
		System.out.println(list);
		list.set(0, "오렌지");          //위치 바꿈
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove("키위");           //remove 삭제
		System.out.println(list);
		
		int num = list.size();
		for (int cnt = 0; cnt <= num; cnt++) {        // for-> 작거나 같으면 1증가 하니 범위에서 벗어남(배열)
			String str = list.get(cnt);
			System.out.println(str);
		}
		
		for (String fruit : list)
			System.out.println(fruit);
		
		Iterator<String> iter = list.iterator();              // 도우미 api(Iterator) collrection 안에 들어 있음 
		while (iter.hasNext())      // has next -> 참
			System.out.println(iter.next());

	}
}
