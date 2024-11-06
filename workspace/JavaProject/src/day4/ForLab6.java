package day4;

public class ForLab6 {

	public static void main(String[] args) {
		final char DECO = '&';
		int rand = (int) (Math.random()*6) + 5;
		for(int x = 1; x <= rand; x++) {
			for(int y = 1; y <= x ; y++) {
		System.out.print(DECO);
			}
		System.out.println();
		}
		

}
}