package mobile;

public class Otab extends Mobile {
	public String mobileName;          // 역시 애내 필요없었음!
	public int batterySize;
	public String osType;
	
	public Otab() {
	}

	public Otab(String mobileName, int batterySize, String osType) {
		setMobileName(mobileName);                    //super도 가능! 부모한테 상속받아서 쓰면됨
		setBatterySize(batterySize);
		setOsType(osType);
	}

	public void operate(int time) {
		int result =getBatterySize();                                //setBatterySize(etBatterySize() - time * 10); -> 이렇게도 계산식 생각할것
		for(int t = 1; t<=time;t++) {
			result-=10;
		}setBatterySize(result);
	}
	
	public void charge(int time) {
		int result1=getBatterySize();                     
		for(int t=1;t<=time;t++) {									 //setBatterySize(etBatterySize() - time * 10); -> 이렇게도 계산식 생각할것
			result1+=10;
		}setBatterySize(result1);
	}

}
