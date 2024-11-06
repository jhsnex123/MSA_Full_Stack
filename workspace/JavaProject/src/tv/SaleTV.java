package tv;

public class SaleTV extends TV {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SaleTV(){

	}
	
	public SaleTV(String model, int size, int channel,int price){
		super(model,size,channel);
		this.price=price;
	}
	
	public void play() {
		System.out.printf("판매TV 채널의%d번의%t프로를플레이%t합니다.\n",getChannel());
	}
	public void sale() {
		System.out.printf("%s모델의 상품을 대여합니다. %d을지불해 주세요.\n",getModel());
	}
	
	public String toString() {
		return String.format("판매상품정보 : 모델명(%	s) 가격(%,d) 크기(%d)", getModel(), price, getSize());
	}
	
}
