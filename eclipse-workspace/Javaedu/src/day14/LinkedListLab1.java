//package day14;
//
//import java.util.LinkedList;
//
//
//class Person {
//	private String name;
//	
//	Person(String name) {
//	this.name = name;
//	}
//	public String getInfo() {
//	return name;
//	}
//
//	class Friend extends Person {
//	
//		private String phoneNum;
//		private String email;
//	
//	  Friend(String name,String phoneNum, String email){
//		super(name);
//		this.phoneNum=phoneNum;
//		this.email=email;
//		
//	}
//	  public String getInfo() {
//	
//		  return super.getInfo() +"   "+ phoneNum+"    " +email ;
//	  }
//	}
//}
//public class LinkedListLab1 { 
//	
//	public static void main(String[] args) {
//		System.out.println("이름          전화번호         매일주소");
//		System.out.println("-------------------------------------");
//		LinkedList<Friend> list = new LinkedList<>();
//		list.add(new Friend("고길동 010-1234-5678 dudu@naver.com")); 
//		list.add(new Friend("둘리몬 010-1234-5677 dudu@naver.com"));
//		list.add(new Friend("짱구몬 010-5959-1004 white dog@naver.com"));
//		list.add(new Friend("신형만 010-5959-1003 white dog@naver.com"));
//		list.add(new Friend("신봉선010-5959-1002white dog@naver.com"));
//	
//		for(Friend elem : list) {
//			System.out.println(elem.getInfo());
//
//	}
//}
//}
