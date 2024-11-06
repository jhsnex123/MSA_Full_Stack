package day4;

public class ControlLab1 {
    public static void main(String[] args) {
        int i = 1; //초기값 1

        while (i <= 10) { //괄호안에 트루아니면 펄스인데 내용은 트루 그러므로 루프
            if (i % 3 == 0 || i % 4 == 0) { //둘 중 하나 참이면 트루로 인정됨 그러므로 트루여서 아래로 내려감
                i++; // 트루면 1증강(증강식)
                continue; // 트루면 다음반복 넘어감
            }

            System.out.println(i); 
            i++; 
        }
    }
}
