package basic.ch07;

class Time {
	private int hour;   // 0 ~ 23 사이의 값을 가져야 함
	private int minute; // 0 ~ 59 사이의 값을 가져야 함
	private int second; // 0 ~ 59 사이의 값을 가져야 함

	// getter & setter
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		this.hour = hour;
	}

	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	public int getHour() {
		return hour;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	public int getMinute() {
		return minute;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) return;
		this.second = second;
	}
}
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 100;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());


	}

}