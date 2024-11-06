package day9;

class Book{            
	String title;
	String author;    //인스턴스 변수 애내는 계속 생성(방) 가능!
	int price;

	Book() {
		this("이것이 자바다","남궁석",38000);
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	 String inforMation() {
		return title+"  "+author+"  "+price+"  " ;
	}

}
public class BookTest {

	public static void main(String[] args) {
		
		Book bk1 = new Book();
		
		System.out.println(bk1.inforMation());
		
		Book bk2 = new Book("자바 hard", "장현수", 15000);
		
		System.out.println(bk2.inforMation());
		
		Book bk3 = new Book("박지성 자서전", "박지성", 35000);
		
		System.out.println(bk3.inforMation());
		
		Book bk4 = new Book("밀리밀리", "밀리", 45000);
		
		System.out.println(bk4.inforMation());

		Book bk5 = new Book("해리포터", "해리포터", 45000);
		
		System.out.println(bk5.inforMation());
	}

}
