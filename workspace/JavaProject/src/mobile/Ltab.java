package mobile;

public class Ltab extends Mobile{
	public String mobileName;
	public int batterySize;
	public String osType;

	public Ltab() {
	}

	public Ltab(String mobileName, int batterySize, String osType) {      
		setMobileName(mobileName);
		setBatterySize(batterySize);
		setOsType(osType);
	}

	public void operate(int time) {
		int result2=getBatterySize();
		for(int t = 1; t<=time;t++) {
			result2-=12;
		} setBatterySize(result2);
	}

	public void charge(int time) {
		int result3 =getBatterySize();
		for(int t = 1; t<=time;t++) {
			result3+=8;
		}setBatterySize(result3);
	}

}
