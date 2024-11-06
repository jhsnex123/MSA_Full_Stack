//제출 소스명 : 소스26.zip
//강사메일주소 : unicodaum@hanmail.net
//메일 제목 : 자바API실습4-XXX
//
//이번 실습도 collection 패키지에서 구현한다.
//
//1. Product.java 는 Product2.java, ProductTest.java 는 ProductTest2.java 로 복사한다.
//2. Product2 클래스는 productPrice 를 기준으로 객체의 대소 관계를 비교할 수 있는 객체가 되도록 구현한다.
//   ---> Comparable 를 상속하여 구현하라는 것임
//3. toString() 메서드를 오버라이딩하여 "제품ID   제품명   가격" 형식으로 리턴하는데
//   가격은 천단위마다 , 를 붙이고 뒤에 원을 붙인다.      
//4. ProductTest2 클래스에서는 9월3일실습_1.pdf 의 내용대로 4개의 객체를 생성하여 LinkedList 객체에 담아
//   Collections.sort() 를 호출한 후 출력했을 때 다음과 같은 결과가 출력되도록 구현한다.
//
//제품 ID       제품명       	가격 
//--------------------------------------------------------- 
//p100 	     TV  		20,000원 
//p200 	     Computer 	10,000원 
//p300 	     Audio 	1,000원 
//p100           MP3               700원


package collection;

import java.util.Objects;

public class Product2 implements Comparable<Product2>{

	private String productID;
	private String productName;
	private int productPrice;
	
	@Override
	public int compareTo(Product2 o) {
		if(productPrice<o.productPrice) return -1;  // 음의 값
		else if(productPrice == o.productPrice) return 0;
		else return 1;
	}
	public Product2() {
		super();
	}
	public Product2(String productID, String productName, int productPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return productID+"\t\t" +productName + "\t\t"+String.format("%,d 원" ,this.productPrice);
	}

}

