import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import javax.swing.*;
import java.awt.*;

public class ThreadExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Thread Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        MyThread myThread = new MyThread(textArea);
        myThread.start();
    }
}

class MyThread extends Thread {
    private JTextArea textArea;

    public MyThread(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void run() {
        SwingUtilities.invokeLater(() -> {
            textArea.append("실행 시작\n");
            textArea.setBackground(Color.YELLOW);
        });

        try {
            // 10초 동안 대기
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            textArea.append("실행 종료\n");
            textArea.setBackground(Color.GREEN);
        });
    }
}
