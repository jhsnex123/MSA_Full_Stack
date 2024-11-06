package day13;

import java.util.Random; //import 기능을 쓸 때 util 다음으로 *기호를 쓰면 class 기능을 다 쓼 수있음  import 단축기(ctal+shift+소문자o)

class Food {
	void print() {
		System.out.println("푸드");
	}
	void eat() {
		System.out.println("맛있게 먹자~");
	}
}

class SeaFood extends Food {
	void print() {
		System.out.println("씨푸드");
	}
	void grillShrimp() {
		System.out.println("새우를 구워먹자~");
	}
}

class HealthyFood extends Food {
	void print() {
		System.out.println("건강푸드");
	}
	void steamVegetable() {
		System.out.println("채소를 쪄서먹자~");
	}
}

public class ClassCastingTest {

	public static void main(String[] args) {
		Random rand = new Random();
		if(rand.nextBoolean())
			prFood(new SeaFood());
		else 
			prFood(new HealthyFood());

	}
	static void prFood(Food f) {
		f.print();
		f.eat();
		if(f instanceof SeaFood) {
		SeaFood sf = (SeaFood)f; // ㅣ value 직접형변환( 부모->자식으로갈때)
		sf.grillShrimp();
	} else {
		HealthyFood hf = (HealthyFood)f;
		hf.steamVegetable();
}
	}
}






