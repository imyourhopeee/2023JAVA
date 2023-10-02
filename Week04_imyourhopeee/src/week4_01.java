import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class Person{

	String name;
	String tel;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String gettel() {
		return name;
	}

	public void settel(String tel) {
		this.tel=tel;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address=address;
	}

	public Person(String name, String tel, String address) {

		super(); // ???? 
		this.name=name;
		this.tel=tel;
		this.address=address;

	}// **

}

public class week4_01 extends JFrame {

	public JPanel panel;
	private JLabel label1,label2,label3;
	public JTextField f1,f2,f3;
	public JButton b1,b2,b3;
	ArrayList<Person> list=new ArrayList<> (); // 

	

	public week4_01() {

		panel=new JPanel();
		setTitle("Address Book");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
		setBounds(100,100,360,252);
		
		label1=new JLabel("이름");
		panel.add(label1);
		f1= new JTextField(15);
		panel.add(f1);

		label2=new JLabel("전화번호");
		panel.add(label2);
		f2= new JTextField(15);
		panel.add(f2);

		label3=new JLabel("주소");
		panel.add(label3);
		f3= new JTextField(50);
		panel.add(f3);
		
		JTextArea textArea=new JTextArea();
		panel.add(textArea);
		

		b1=new JButton("저장");
		b1.addActionListener(e-> {
			String name=f1.getText();
			String tel=f2.getText();
			String address =f3.getText();
			list.add(new Person(name,tel,address));
		});
		
		b2=new JButton("검색");
		b2.addActionListener(e->{
			String name=f1.getText();
			for (Person p:list) {
				if (p.getName().equals(name)) {
					f1.setText(p.gettel());
					textArea.setText(p.getaddress());
				}
			}
		});
		b3=new JButton("종료");
		b3.addActionListener(e-> {
			System.exit(0);
		});

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

	
		add(panel);
		setVisible(true);	
		
	}
	
	public static void main(String[] args) {

		week4_01 w1=new week4_01();

	}

}