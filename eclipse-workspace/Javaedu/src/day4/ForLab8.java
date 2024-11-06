package day4;

public class ForLab8 {

    public static void main(String[] args) {
       
        final char STAR = '*'; 
        final int ROW = 5; 
        final int STARS = 10; 

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < STARS; k++) {
                System.out.print(STAR);
            }

            System.out.println();
        }
    }
}