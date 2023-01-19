
public class Time {
	//attributes
	private int second;
	private int minute;
	private int hour;
	//Default constructor
	public Time() {
		this.second = 0 ;
		this.minute = 0;
		this.hour = 0;
	}
	public Time(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	//return to string
	
	public String toString() {
		//use func. String.format() to form a formatted String
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	//set sec min hr to txt
	public void setTime(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	public Time nextSecond() {
		++second;
		if(second >= 60) {
			second = 0;
			++minute;
			if(minute>=60) {
				minute = 0;
				++hour;
				if(hour >=24) {
					hour =0;
				}
			}//end min
		}//end dec
		return this;
	}


}
