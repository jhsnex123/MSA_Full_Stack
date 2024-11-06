package model.domain;
public class ProductDTO {
	private int apple;
	private int banana;
	private int halabong;
	public int getApple() {
		return apple;
	}
	public void setApple(int apple) {        
		this.apple += apple;	 // // 아규먼트 값에 +=를 해서 1씩 증가 시키기
	}
	public int getBanana() {
		return banana;
	}
	public void setBanana(int banana) {
		this.banana += banana;
	}
	public int getHalabong() {
		return halabong;
	}
	public void setHalabong(int halabong) {
		this.halabong += halabong;
	}	
}
