import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class week4_03 extends JFrame{

	public JPanel p;
	private JLabel label1,label2,label3;
	
	public week4_03() {

		setTitle("BusinessCard");
		setSize(600,250);
		p=new JPanel();

		ImageIcon Icon=new ImageIcon("src\\다운로드.jpg"); 
		JLabel label4=new JLabel(Icon);
		p.add(label4);

		label1=new JLabel("김덕성");
		label2=new JLabel("프로젝트 매니저");
		label3=new JLabel("덕성주식회사");

		p.add(label1);
		p.add(label2);
		p.add(label3);

		add(p); // panel자제도 add해줘야 보임
		setVisible(true);
	}

	public static void main(String[] args) {
		week4_03 w3=new week4_03();

	}
}
