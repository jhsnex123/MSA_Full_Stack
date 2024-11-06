package day4;

public class WhileLab1 {

	public static void main(String[] args) {

        int randomNum =(int)(Math.random() * 6)+5; //5~10까지+5 랜덤숫자 1~5부터면 +1
        
        System.out.println("[ for 결과 ]");
        for (int i = 1; i <= randomNum; i++) {
            System.out.println(i + " -> " + (i * i));
        }
        
        System.out.println("[ while 결과 ]");
        int j = 1;// 초기식
        while (j <= randomNum) {
            System.out.println(j + " -> " + (j * j)); // 괄호를 안쓰고 제곱을 할 수 있지만 가독성을 좋게 하기 위해 괄호를 쓰는게 좋음
            j++; //참이기 때문에 1증강
        } //  여기까지가 While문 범위
    }
}