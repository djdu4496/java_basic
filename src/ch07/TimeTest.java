package ch07;

class Time {
	private int hour;   // 0 ~ 23 ������ ���� ������ ��
	private int minute; // 0 ~ 59 ������ ���� ������ ��
	private int second; // 0 ~ 59 ������ ���� ������ ��
	
	// getter & setter
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		this.hour = hour;
	}
	
	// �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
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
