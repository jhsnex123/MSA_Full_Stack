package tv;

public class RentalTV extends TV {
	private int price;


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public RentalTV(){
		
	}
	
	public RentalTV(String model, int size, int channel,int price){
		super(model,size,channel);
		this.price=price;
	}
	public void play() {
		System.out.printf("대여 TV 채널 %d번의 프로를 플레이 합니다.\n",getChannel());
	}
	public void rent() {
		System.out.printf("%s모델의 상품을 대여합니다. %d을지불해 주세요",getModel());
	}
	
	public String toString() {
		return String.format("대여상품정보 : 모델명(%	s) 가격(%,d) 크기(%d)", getModel(), price, getSize());
	}
	
	
	
	
	
}

