package day14;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetLab1 {
	

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		for(int size = set.size(); size<=10; size++) {                       //while(set.size() < 10) {
			int rand = day9.MethodLab6.getRandom(10,30);            // set.add(day9.MethodLab6.getRandom(10,30));  
			set.add(rand);	
		}
		System.out.println(set.size());
		System.out.print("오늘의 로또 번호 : ");
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			
			if(iterator.hasNext()) 
				System.out.print(", ");
			}
	     }
	}
	


