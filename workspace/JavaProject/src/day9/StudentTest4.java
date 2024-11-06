package day9;

class Student4 {
	String name;
	String subject;
	int grade;
	
	Student4() {
		this("고길동", "Spring Boot", 5 ); // 같은 클래스안에 있는 메서드를 쓸수 있는데 생성자 메서드안에서만 사용 가능하고 아규먼트 값 같은거값을 대신 수행 할 수 있음
		System.out.println("매개변수 없는 생성자 호출~~~");    //this (메서드)는 첫번째 행에서만 호출 가능 this는 여러 메서드가 오버로딩값이 많을때 쓴다. 애를 쓰면 첫번쨰로 먼저 사용됨
	}				
	
	Student4(String n) {
		System.out.println("name 매개변수가 선언된 생성자 호출~~~");
		name = n;
		
	}
	
	Student4(String name, String subject, int grade) {   //생성자 메서드는 리턴타입 생략이 되어야함 (ex.void --< x) ,클래스 이름하고 일치해야함!!
		this.name = name;
		this.subject = subject;              //this에다가 .을 붙이면 변수로 호출 가능
		this.grade = grade;
	}
	
	void study() {
		System.out.println(name + "학생은 "+ subject + "과목을 학습합니다."); 
	}
	String getStudentInfo() {
		return name + "학생은 " +grade + "학년입니다";
	}
}
public class StudentTest4 {                    
	public static void main(String[] args) {
		Student4 st1 = new Student4();
//		st1.name ="올라프";
//		st1.subject = "Servlet";
//		st1.grade = 2;
		System.out.println(st1.getStudentInfo());
		st1.study();
		
		Student4 st2 = new Student4("안나");
		System.out.println(st2.getStudentInfo());
		st2.study();
		
		Student4 st3 = new Student4("엘사","AJAX",4);

		System.out.println(st3.getStudentInfo());
		st3.study();
	}

}
