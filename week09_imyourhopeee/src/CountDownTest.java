import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
	private JLabel label;
	
	Thread t; //스레드 개념
	
	class Counter extends Thread{
		public void run() {
			for (int i=0;i<=100; i++) {
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					return; 
				}label.setText(i+" ");
			}
		}
	}
	
	public CountDownTest() {
		setTitle("카운트다운");
		setSize(400,150);
		getContentPane().setLayout(null); //getContentPane?
		
		label=new JLabel("0");
		label.setBounds(0,0,384,111);
		label.setFont(new Font("Serif", Font.BOLD,100));
		getContentPane().add(label);
		
		JButton b=new JButton("카운트 중지");
		b.setBounds(247,24,125,23);
		
		b.addActionListener(e-> t.interrupt());//람다식
		getContentPane().add(b);
		setVisible(true);
		
		JButton b2=new JButton("카운트 다시 시작");
		b2.setBounds(247,54,125,23);
		
		b2.addActionListener(e->{
			if(t.isAlive()) {
				t.interrupt();
			}t= new Counter();
			t.start();
			
		});
		getContentPane().add(b2);
		setVisible(true);
		
		t=new Counter();
		t.start();
	}
	
	public static void main(String[] args) {
		CountDownTest t= new CountDownTest();

	}

}
