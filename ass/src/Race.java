import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Race extends JFrame {

    class MyThread extends Thread {
        private JLabel label;
        private int x, y;
        private String carName;
        private volatile boolean isRaceStarted = false;

        public MyThread(String fname, int x, int y, String carName) {
            this.x = x;
            this.y = y;
            this.carName = carName;
            label = new JLabel();
            label.setIcon(new ImageIcon(fname));
            label.setBounds(x, y, 100, 100);
            add(label);
        }

        public void run() {
            try {
                while (!isInterrupted() && x < getWidth() * 3 / 4) {
                    if (isRaceStarted) {
                        x += 10 * Math.random();
                        label.setBounds(x, y, 100, 100);
                        repaint();
                        Thread.sleep(100);
                    }
                }

                
                synchronized (Race.this) {
                    finishOrder.add(this);
                }

            } catch (InterruptedException e) {
                
            }
        }

        public void stopRace() {
            interrupt(); 
        }

        public void startRace() {
            isRaceStarted = true;
            new Thread(this).start(); 
        }

        public void reset() {
            isRaceStarted = false;
            x = 0;
            label.setBounds(x, y, 100, 100);
        }

        public int getX() {
            return x;
        }

        public String getCarName() {
            return carName;
        }
    }

    class RacePanel extends JPanel {
        public RacePanel() {
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            
            g.setColor(new Color(222, 184, 135, 125));
            g.fillRect(0, 0, getWidth(), getHeight());

            
            g.setColor(Color.BLACK);
            g.drawLine(getWidth() * 3 / 4, 0, getWidth() * 3 / 4, getHeight());
        }
    }

    private List<MyThread> finishOrder = Collections.synchronizedList(new ArrayList<>());

    public Race() {
        setTitle("Race");
        setSize(600, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        RacePanel racePanel = new RacePanel();
        setContentPane(racePanel);

        MyThread car1 = new MyThread("car1.gif", 100, 0, "Car 1");
        MyThread car2 = new MyThread("car2.gif", 100, 50, "Car 2");
        MyThread car3 = new MyThread("car3.gif", 100, 100, "Car 3");
        MyThread car4 = new MyThread("car1.gif", 100, 150, "Car 4");

        JButton b1 = new JButton("Start!");
        b1.setBounds(10, 10, 80, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car1.reset();
                car2.reset();
                car3.reset();
                car4.reset();
                car1.startRace();
                car2.startRace();
                car3.startRace();
                car4.startRace();
            }
        });
        add(b1);

        JButton b2 = new JButton("End!");
        b2.setBounds(10, 50, 80, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car1.stopRace();
                car2.stopRace();
                car3.stopRace();
                car4.stopRace();

                
                Collections.sort(finishOrder, (c1, c2) -> Integer.compare(c1.getX(), c2.getX()));
                for (int i = 0; i < finishOrder.size(); i++) {
                    MyThread car = finishOrder.get(i);
                    System.out.println(car.getCarName() + " finished in position " + (i + 1) + "!");
                }

                finishOrder.clear(); 
            }
        });
        add(b2);

        setVisible(true);
    }

    public static void main(String[] args) {
        Race t = new Race();
        t.setLocationRelativeTo(null); 
    }
}
