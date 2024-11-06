package day9;

public class MethodLab6 {

    // 1부터 n까지 범위의 난수를 반환하는 메서드
    public static int getRandom(int n) {
        return (int)(Math.random() * n) + 1; // 1부터 n까지의 난수
    }

    // n1부터 n2까지 범위의 난수를 반환하는 메서드
    public static int getRandom(int n1, int n2) {
        return (int)(Math.random() * (n2 - n1 + 1)) + n1; // n1부터 n2까지의 난수
    }

    public static void main(String[] args) {
        // getRandom(10) 메서드를 5번 호출하여 결과를 출력
        System.out.print("getRandom(10): ");
        for (int i = 0; i < 5; i++) {
            System.out.print(getRandom(10));
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(); 

        System.out.print("getRandom(10, 20): ");
        for (int i = 0; i < 5; i++) {
            System.out.print(getRandom(10, 20));
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }
}