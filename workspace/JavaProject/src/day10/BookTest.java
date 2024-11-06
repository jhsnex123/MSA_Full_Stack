package day10;

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
		
		Book[] ary= new Book[5];
		ary[0] = new Book();
		ary[1] = new Book("자바 hard", "장현수", 15000);
		ary[2] = new Book("박지성 자서전", "박지성", 35000);
		ary[3] = new Book("밀리밀리", "밀리", 45000);
		ary[4] = new Book("해리포터", "해리포터", 45000);
		
		for(Book elem : ary)
		System.out.println(elem.inforMation());
		
	}
}
