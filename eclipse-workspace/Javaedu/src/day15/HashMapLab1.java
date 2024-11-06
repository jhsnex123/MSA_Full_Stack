package day15;

import java.util.HashMap;


import java.util.Scanner;

public class HashMapLab1 {
	
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		String country;
		int population;
		
		while(map.size()<5) {
			System.out.println("나라이름을 입력하세요 :");
			country = scan.nextLine();
			if(map.containsKey(country)) {
			System.out.println(" 나라명 "+country +"는 이미 저장되었습니다.");
			}else {
				System.out.print("인구 수를 입력하세요 : ");
				population = scan.nextInt();
				scan.nextLine();
				map.put(country, population);
				System.out.print("*저장되었습니다.*");
		
			}
		}
			System.out.println("5개가 모두 입력되었습니다 : ");
			scan.close();
			
			
           // 좀 더 공부하고 재제출 하겠습니다,.
}
}





