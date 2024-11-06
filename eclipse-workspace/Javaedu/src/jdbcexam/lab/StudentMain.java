package jdbcexam.lab;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		StudentDAO stu = new StudentDAO();
			Scanner scan = new Scanner(System.in);
			//loop: while (true) {
				System.out.println("[ 처리하려는 기능을 선택하세요.]");
				System.out.println("1. 학생 정보 출력"); //s
				System.out.println("2. 학생 정보 입력"); //t
				System.out.println("3. 학생 점수 확인"); //u
				System.out.println("4. 종료");//end
				System.out.print("입력 : ");
				String aws = "";
				aws = scan.nextLine();
				List<StudentDTO> getScore = null;
				
				switch (aws) {
				case "1":
					getScore=stu.getAllStudent();
					System.out.println("=".repeat(70));
					for (StudentDTO dto : getScore )  //향상된 for문써서 dto에 있는 값을 반복해서 쓸 수 있게 함 --> vlist <--dto 리턴값
						System.out.println(dto);
					System.out.println("=".repeat(70));
					break;
					
				case "2":
					while (true) {
						System.out.print("학생 정보를 입력하세요 : ");
						String name = scan.nextLine();
						System.out.print("점수를 출력하세요 : ");
						int score= scan.nextInt();
						StudentDTO dto= new StudentDTO();
						dto.setName(name);
						dto.setScore(score);
						if(stu.insertStudent(dto))
						System.out.println("입력 성공");
						else {
						System.out.println("입력 실패");
						break;
						
					case "3":
						 System.out.print("점수를 확인할 학생의 이름을 입력하세요: ");
		                    String name = scan.nextLine();
		                    getScore=stu.getAllStudent();
		                    if (getScore == null) { 
		                        System.out.println(name + " 학생은 존재하지 않습니다.");
		                    } else {
		                        System.out.println(name + " 학생의 점수는 " + getScore + "입니다.");
		                    }
		                    break;
	                case "4":
	                    break loop;   
	            }
					}
					System.out.println("프로그램 수행을 종료합니다.");
					scan.close();
				}
}
}
