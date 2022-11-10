package ch13;

class Ex13_1 {
    public static void main(String args[]) {
        for(int i=0; i < 500; i++) {
            System.out.print(0);
        }

        for(int i=0; i < 500; i++) {
            System.out.print(1);
        }
    }
}

class ThreadEx1_1 extends Thread {  // 1. Thread클래스를 상속해서 쓰레드를 구현
    public void run() {  // 쓰레드가 수행할 작업을 작성
        for(int i=0; i < 500; i++) {
            System.out.print(0); // 조상인 Thread의 getName()을 호출
        }
    }
}

class ThreadEx1_2 implements Runnable {  // 2. Runnable인터페이스를 구현해서 쓰레드를 구현
    public void run() {  // 쓰레드가 수행할 작업을 작성
        for(int i=0; i < 500; i++) {
            // Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
            System.out.print(1);
        }
    }
}