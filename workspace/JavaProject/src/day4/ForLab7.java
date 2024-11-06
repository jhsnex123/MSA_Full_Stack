package day4;

public class ForLab7 {

    public static void main(String[] args) {
        final char STAR = '*';

        int row = 7;

        for (int i = row ; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(STAR);
            }
            System.out.println(); 
        }
    }
}
