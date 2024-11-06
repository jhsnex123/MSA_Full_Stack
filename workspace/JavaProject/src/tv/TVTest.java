package tv;

public class TVTest {
 public static void main(String args[]) {
	 TV SaleTV = new SaleTV("SALETV-1",40,1,300000);									//	 SaleTV, RentalTV 클래스의 객체를 각각 생성한다.
	 TV RentalTV = new RentalTV("RENTALTV-10",42,1,100000);						//	 SaleTV 객체는 채널을 두 개 높인다.
			
	 	SaleTV.channelUp();
	 	SaleTV.channelUp();
	 	
	 	RentalTV.channelDown();
	 	RentalTV.channelDown();
	 	RentalTV.channelDown();
 }
		 static void printAllTV(TV tv) {
			 System.out.println(tv); //toString();
			  if(tv instanceof SaleTV) {
			  SaleTV stv = (SaleTV)tv;
			  stv.sale();
			  stv.play();
			 		
			  }else if(tv instanceof RentalTV) {
			   ((RentalTV)tv).play();
			 }
			  System.out.println(tv); 
			  if(tv instanceof RentalTV) {
				  RentalTV rtv = (RentalTV)tv;
				  rtv.rent();
				  rtv.play();
			  }else if(tv instanceof SaleTV) {
				   ((SaleTV)tv).play();
		 }
		 }
 
	    static void printRentalTV(Rentable tv) {
		tv.rent();							
	}
}
 