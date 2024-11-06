package exercise;


class Student extends Human {
	private String number;
	private String major;
	
	public Student(String name, int age, int height, int weight, String number, String major){
		super(name,age,height,weight);
		this.number=number;
		this.major=major; }
		
	public String printInformation() {
		return super.printInformation() +number+"   "+major;    
	}
}

public class StudentTest {

	public static void main(String[] args) {
	
		Student ary[] = new Student[3];
		ary[0] = new Student("홍길동",20,171,81,"201101","영문".toString());
		ary[1] = new Student("고길동",21,183,72,"201102","건축".toString());
		ary[2] = new Student("박길동",22,175,65,"201103","컴공".toString());
		
		for(Student elem : ary) {
			System.out.println(elem.printInformation());
		}
	}

}
