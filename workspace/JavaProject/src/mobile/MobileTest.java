package mobile;

public class MobileTest {

	public static void main(String args[]) {
		Mobile ltab = new Ltab("Ltab", 500, "ABC-01");
        Mobile otab = new Otab("Otab", 1000, "XYZ-20");
       
        printTitle();
        printMobile(ltab);
        printMobile(otab);
        System.out.println();
        ltab.charge(10);
        otab.charge(10);
       
        printTitle();
        System.out.println("[10분 충전]");
        printMobile(ltab);
        printMobile(otab);
        System.out.println();
        
        ltab.operate(5);
        otab.operate(5);
        
        printTitle();
        System.out.println("[5분 통화]");
        printMobile(ltab);
        printMobile(otab);
    }

    public static void printMobile(Mobile mobile) {
    
    	System.out.print(mobile.getMobileName()+"\t\t\t"+mobile.getBatterySize()+"\t\t\t"+mobile.getOsType());

        System.out.println();
    }

    public static void printTitle() {
        System.out.println("Mobile\t\t"+"Battery\t\t"+"OS");
        System.out.println("-".repeat(50));     //repeat()? 알아보기
    }
}