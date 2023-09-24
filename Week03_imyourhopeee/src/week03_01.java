import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class week03_01 extends JFrame {
	public week03_01() {

		JPanel panel=new JPanel();
		add(panel);
		setSize(300,200);
		
		JLabel label1=new JLabel("회의 등록하기");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("패스워드");

		JTextField field1=new JTextField(15);
		JTextField field2=new JTextField(15);
	
		JLabel label4=new JLabel("이메일주소");
		JLabel label5=new JLabel("전화번호");
		JTextField field3=new JTextField(15);
		JTextField field4=new JTextField(15);

		panel.add(label1);
		panel.add(label2);
		panel.add(field1);
		panel.add(label3);
		panel.add(field2);
	
		panel.add(label4);
		panel.add(field3);
		panel.add(label5);
		panel.add(field4);

		JButton button1=new JButton("등록하기");
		JButton button2=new JButton("취소");

		panel.add(button1);
		panel.add(button2);
		setVisible(true);


	}
	public static void main(String[] args) {

		week03_01 w=new week03_01();
	}
}