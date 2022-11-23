package basic.ch07;

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
//		basic.ch07.Player p = new basic.ch07.Player(); // �߻�Ŭ������ ��ü�� ����
//		basic.ch07.AudioPlayer ap = new basic.ch07.AudioPlayer();
		Player ap = new AudioPlayer(); /// ������
		ap.player(100);
		ap.stop();
	}
}