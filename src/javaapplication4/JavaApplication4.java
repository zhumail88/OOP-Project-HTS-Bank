package javaapplication4;

import java.awt.EventQueue;

public class JavaApplication4 {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
                
            }
        });
    }
}
