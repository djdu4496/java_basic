package ch07;

abstract class Player {
	abstract void player(int pos); // 추상메서드(미완성 메서드)
	abstract void stop();          // 추상메서드(선언부만 있고 구현부{}가 없는 메서드)
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player {
	void player(int pos) { System.out.println(pos + "위치부터 play합니다.");}
	void stop() { System.out.println("재생을 멈춥니다.");}
}

public class PlayerTest {
	public static void main(String[] args) {
//		ch07.Player p = new ch07.Player(); // 추상클래스의 객체를 생성
//		ch07.AudioPlayer ap = new ch07.AudioPlayer();
		Player ap = new AudioPlayer(); /// 다형성
		ap.player(100);
		ap.stop();
	}
}