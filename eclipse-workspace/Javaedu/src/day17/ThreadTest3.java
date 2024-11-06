package day17;

class ThreadTest3 {
	public static void main(String args[]) throws Exception {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run(); // run 메서드(자식 스레드)가 먼저 호출되면 스레드가 작동이안됨 부모 스레드가 먼저 자동호출됨
	}
}

class ThreadEx3_1 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
