package day10;

class AchademyFriend{
	
	static String achademyName ="KOSA";
	private String name;
	private String color;
	private String hobby;
	private String food;
	

	AchademyFriend (String name,String color, String hobby, String food){
		this.name=name;               //장종현 베이지,햄버거(버거리),헬스
		this.color=color;               //서샘이 핑크,떡볶이(가레떡볶이),게임
		this.hobby=hobby;              //김경아 스카이블루,빙수(녹차),게임
		this.food=food;
}
	String getName() {
		return name;
	}

	String getColor() {
		return color;
	}
	String getHobby() {
		return hobby;
	}
	String getFood() {
		return food;
	}
}
public class AFTest {
	public static void main(String[] args) {
		
		AchademyFriend[] ary = new AchademyFriend[4];
	    
		ary[0] = new AchademyFriend("장현수","초록","축구","라면(사천 짜파게티)");
		ary[1] = new AchademyFriend("장종현","베이지","헬스","햄버거(버거리)");
		ary[2] = new AchademyFriend("서샘이","핑크","게임","떡볶이(가래떡볶이)");
		ary[3] = new AchademyFriend("김경아","스카이블루","게임","빙수(녹차)");
		
		for(AchademyFriend info : ary) {
			System.out.printf("%s 동료는 좋아하는 컬러가 %s 취미는 %s 입니다. "
					+ "그리고 제일 좋아하는 음식은 %s 입니다. 지금은 %s 에서 학습하고 있어요. \n"
					    ,info.getName(),info.getColor(),info.getHobby(),info.getFood(),AchademyFriend.achademyName);

		}
}
}