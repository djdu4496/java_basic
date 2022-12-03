package ver3.practice.ch06;

// 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
// (단, 모든 병사의 공격력과 방어력은 같아야 한다.)

class Marine2 {
    int x=0, y=0;   // Marine의 위치좌표(x,y)
    int hp = 60;    // 현재 체력
    int weapon = 6; // 공격력
    int armor = 0;  // 방어력

    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Ex6_9 {
    public static void main(String[] args) {
        System.out.println("답안 : weapon, armor, 이유 : 모든 객체가 같은 속성을 공유하는 '공통속성'이기 때문");
        System.out.println("답안 : weaponUp(), armorUp(), 이유 : cv를 사용하기 때문(iv를 사용하지 않기 때문)");
    }
}
