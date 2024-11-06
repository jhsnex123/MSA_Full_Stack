package day9;

class Member {
	String name;
	String account;
	String passwd;
	int birthyear;
}

public class MemberTest {

	public static void main(String[] args) {
		Member mb1 = new Member();

		mb1.name = "손흥민";
		mb1.account = "토트넘";
		mb1.passwd = "득점왕";
		mb1.birthyear = 19920708;

		System.out.println("회원1 : " + mb1.name + "(" + mb1.account + "," + mb1.passwd + "," + mb1.birthyear + ")");

		Member mb2 = new Member();

		mb2.name = "이강인";
		mb2.account = "PSG";
		mb2.passwd = "탁구왕";
		mb2.birthyear = 20010219;

		System.out.println("회원2 : " + mb2.name + "(" + mb2.account + "," + mb2.passwd + "," + mb2.birthyear + ")");

		Member mb3 = new Member();

		mb3.name = "김민재";
		mb3.account = "뮌헨";
		mb3.passwd = "수비왕";
		mb3.birthyear = 19961115;

		System.out.println("회원3 : " + mb3.name + "(" + mb3.account + "," + mb3.passwd + "," + mb3.birthyear + ")");

	}

}
