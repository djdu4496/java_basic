package ch07;

abstract class Player {
	abstract void player(int pos); // �߻�޼���(�̿ϼ� �޼���)
	abstract void stop();          // �߻�޼���(����θ� �ְ� ������{}�� ���� �޼���)
}

// �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ���� ����
class AudioPlayer extends Player {
	void player(int pos) { System.out.println(pos + "��ġ���� play�մϴ�.");}
	void stop() { System.out.println("����� ����ϴ�.");}
}

public class PlayerTest {
	public static void main(String[] args) {
//		ch07.Player p = new ch07.Player(); // �߻�Ŭ������ ��ü�� ����
//		ch07.AudioPlayer ap = new ch07.AudioPlayer();
		Player ap = new AudioPlayer(); /// ������
		ap.player(100);
		ap.stop();
	}
}