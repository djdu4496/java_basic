package ver3.practice.ch07;

// 아래의 EventHandler를 익명 클래스(anonymous class)로 변경하시오.

import java.awt.*;
import java.awt.event.*;

public class Ex7_28 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}
