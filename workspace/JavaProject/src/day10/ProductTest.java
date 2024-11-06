package day10;

class Product{
	String name;
	int balance;
	int price;


Product(){
	this("듀크인형",5,10000);
}

Product(String name, int balance, int price){
	this.name=name;
	this.balance=balance;
	this.price=price;
}


String getName() {
	return name;
}

int getBalance() {                  //gether 메서드라고 불림
	return balance;
}

int getPrice() {
	return price;
}

}

public class ProductTest {

	public static void main(String[] args) {
		Product[] ary = new Product[5];
		ary[0] = new Product();
		ary[1] = new Product("듀커인형",6,10000);
		ary[2] = new Product("해리인형",7,13000);
		ary[3] = new Product("케인인형",8,14000);
		ary[4] = new Product("해커인형",9,15000);
		 
		
		for(Product elem : ary) {
			System.out.printf("%s   %d개    %,d원\n",elem.getName(), elem.getBalance(),elem.getPrice());
	

}
}
}