package day4;

public class WhileLab2 {

    public static void main(String[] args) {
   
        while (true) { // 무한루프
            int pairNum1 =(int)(Math.random() * 6)+1; // 0~6까지 +1 = 1~6
            int pairNum2 =(int)(Math.random() * 6)+1; // 0~6까지 +1 = 1~6
            
            
            if (pairNum1 != pairNum2) { // 둘이 다르니 트루면 무한루프 다르면 빠져나감(else로)
                if (pairNum1 > pairNum2) {  // 1이 2보다 크면 트루면 무한루프 빠져나감(else로)
                    System.out.println("pairNum1이 pairNum2 보다 큽니다.");
                } else {
                    System.out.println("pairNum1이 pairNum2 보다 작습니다.");
                }
            }  
            else {
                System.out.println("게임 끝"); // 각 반복 후 줄바꿈
                break; //연산상관없이 멈춤
            }
        }
    }
}