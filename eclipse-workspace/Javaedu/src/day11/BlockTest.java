package day11;

public class BlockTest {
	static {
		System.out.println("*static 블럭 수행*");//1
	}
	{
		System.out.println("#instance 블럭 수행#");//2
	}

	public BlockTest() {
		System.out.println("#생성자 수행#");//3
	}

	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");//4
		BlockTest bt = new BlockTest();
		System.out.println(bt);
		System.out.println("BlockTest bt2 = new BlockTest(); ");//5
		BlockTest bt2 = new BlockTest();
		System.out.println(bt2);
	}
}
