package day14;



class Person {
		private String name;
		
		Person(String name) {
		this.name = name;
		}
		public String getInfo() {
		return name;
		}
	}
		class Friend extends Person {
		
			private String phoneNum;
			private String email;
		
		  Friend(String name,String phoneNum, String email){
			super(name);
			this.phoneNum=phoneNum;
			this.email=email;
			
		}
		  public String getInfo() {
		
			  return super.getInfo() +"   "+ phoneNum+"    " +email ;
		  }
		}		  
public class FriendTest {

	public static void main(String[] args) {
		System.out.println("이름          전화번호         매일주소");
		System.out.println("-------------------------------------");
		Friend[] ary= new Friend[5];
		ary[0]= new Friend("고길동","010-1234-5678","dudu@naver.com".toString());
		ary[1]= new Friend("둘리몬","010-1234-5677","dudu@naver.com".toString());
		ary[2]= new Friend("짱구몬","010-5959-1004","white dog@naver.com".toString());
		ary[3]= new Friend("신형만","010-5959-1003","white dog@naver.com".toString());
		ary[4]= new Friend("신봉선","010-5959-1002","white dog@naver.com".toString());
		
		for(Friend elem : ary) {
			System.out.println(elem.getInfo());
		}
	}
}
		
