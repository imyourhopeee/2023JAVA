import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class week03_03 extends JFrame {
	int img_x=150, img_y=150;
	JButton Left,Right;
	JPanel panel;
	JLabel label;
	
	
	public week03_03() {
		setSize(600,300);
		panel=new JPanel();
		label=new JLabel();
		ImageIcon icon=new ImageIcon("file:///C:/Users/SAMSUNG/OneDrive/문서/덕성여대/2-1)%20사이버보안/객체프로그래밍%20기초/practice/Week03/src/ef6003e4-d40f-4a68-a5f1-aa851108ef11.jpg");
		label.setIcon(icon);
		label.setLoction(img_x,img_y);
		
		Left=new JButton("LEFT");
		Right=new JButton("RIGHT");
		
		panel.add(Left);
		panel.add(Right);
		
		setVisible(true);
		
		panel.addActionListener(new MyListener())
	}
	