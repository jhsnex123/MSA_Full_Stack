package model;

public class TimeVO {

private int hour;
private int minute;

public TimeVO(int hour, int minute){            
	//Calendar calender = Calender.getInstance();
	this.hour=hour;    //calender.get  (calender.HOUR.OF.DAY )   
	this.minute=minute; //calender.get  (calender.MINUTE)
}

public int getHour() {
	return hour;
}

public int getMinute() {
	return minute;
}


}
