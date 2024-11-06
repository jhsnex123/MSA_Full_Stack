package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ProductTest {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();		
		list.add(new Product("p100", "TV", "20000"));
		list.add(new Product("p200", "Computer", "10000"));
		list.add(new Product("p100", "MP3", "700"));
		list.add(new Product("p300", "Audio", "1000"));
		
		HashSet<Product> set = new HashSet<Product>();
		
		for (int i = 0; i < list.size(); i++) {
			if (set.add(list.get(i))) {
				System.out.println("성공적으로 저장되었습니다.");
			} else {				
				System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
			}
		}
		System.out.println();
		System.out.println("제품ID\t\t제품명\t\t가격");
		for (Product product : set) {
			System.out.println(product);
		}		
	}
}