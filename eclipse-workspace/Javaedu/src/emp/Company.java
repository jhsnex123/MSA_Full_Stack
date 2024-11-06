//package emp;
//
//public class Company {
//
//	public static void main(String[] args) {
//		Employee[] emp =new Employee[2];
//		emp[0] = new Secretary("Duke",1,"secretary",800);
//		emp[1] = new Sales("Tuxi",2,"sales",1200);
//		
//		
//		System.out.println();
//		 printEmployee(emp,true);
//		
//		 System.out.println("[인센티브 100 지급]");
//		 System.out.println("name\t\ttdepartment\tsalary\ttax\textra pay");
//		 System.out.println("-".repeat(30));
//		
//		 for(Employee e : emp)
//			 ((Bonus)e).incentive(100);
//		printEmployee(emp,false);
//	}
//	
//
//	public static void printEmployee(Employee[] emp, boolean isTax) {
//		
//		if(isTax) {
//			for(Employee e : emp) {
//					System.out.println(emp[i].getName() + "\\t\t" + e.getDepartment()+(e.getDepartment().length() < 8 ? "\t\\t\\t" : "\\t\\t")+e.getSalary());
//					System.out.println(e instanceof Sales ? "\t\t" +((Sales)e).getExtraPay() : "");
//				}
//			}else {
//	}
//}
//}