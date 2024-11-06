package emp;

public class Secretary extends Employee{

public Secretary() {
	
}
public Secretary(String name,int number,String department, int salary) {
	super(name,number,department,salary);	
}

public double tax() {
	return getSalary()*0.1;
		//세금계산  salary에 세금10%(0.1) 부여해야함 
}
public void incentive(int pay) {
	pay = 100;
	System.out.println(pay+(100*1.2));
}


}




