package ch07;

class Tv {
	boolean power; // 전원상태(on/off)
	int channel;   // 채널

	void power()	 {	power =	!power; }
	void channelUp() { 	++channel;      }
	void channelDown() { 	--channel;  }
}

class SmartTv extends Tv { // SmartTv는 ch06.Tv에 캡션(자막)을 보여주는 기능을 제공한다.
	boolean caption;       // 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) {      // 캡션상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}
class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		// Cannot resolve symbol 'channel'
		stv.channel = 10; // 조상클래스로부터 상속받은 멤버
		stv.channelUp();  // 조상클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true; // 캡션(자막)기능을 켠다.S
		stv.displayCaption("Hello, World");
	}
} 