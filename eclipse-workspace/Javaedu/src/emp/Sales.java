package emp;

public class Sales extends Employee{

public Sales() {
	
}
	
public Sales (String name,int number,String department, int salary) {
		super(name,number,department,salary);	
}

public double tax() {
	return getSalary()*0.13;
	
}

public void incentive(int pay) {
	pay = 100;
	System.out.println(pay+(100*0.8));
}
public double getExtraPay() {
	return getSalary()*0.03;

	
}


}