package ver3.practice.ch07;

// 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이 클래스를 상속받도록 코드를 변경하시오.

public class Ex7_17 {
    public static void main(String[] args) {
        Unit u = new Tank();
//        u.changeMode();  // Cannot resolve method 'changeMode' in 'Unit'
        u.x = 3;
        u.y = 2;
        u.move(0, 0);
        u.stop();
    }
}
abstract class Unit {
    int x, y;  // 현재 위치
    abstract void move(int x, int y);
    abstract void stop();
}

class Marine extends Unit {   // 보병
    void move(int x, int y) {/* 지정된 위치로 이동*/}
    void stop()             {/* 현재 위치에 정지*/}
    void stimPack()         {/* 스팀팩을 사용한다.*/}
}

class Tank extends Unit {     // 탱크
    void move(int x, int y) {/* 지정된 위치로 이동*/}
    void stop()             {/* 현재 위치에 정지*/}
    void changeMode()       {/* 공격모드를 변환한다.*/}
}

class Dropship extends Unit { // 수송선
    void move(int x, int y) {/* 지정된 위치로 이동*/}
    void stop()             {/* 현재 위치에 정지*/}
    void load()             {/* 선택된 대상을 태운다.*/}
    void unload()           {/* 선택된 대상을 내린다.*/}
}

