import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class week03_02 extends JFrame  {

	private JPanel panel;
	private JTextField field;
	private JLabel label1,label2;
	double k,t;
	Mylistener listener=new Mylistener();
	
	public week03_02() {

		panel=new JPanel();
		add(panel);
		setSize(300,200);
		setTitle("Mile->Km");
		
		label1=new JLabel("마일을 입력하시오");
		field=new JTextField(15);

		panel.add(label1);
		panel.add(field);
		label2=new JLabel("->"+k);
		panel.add(label2);

		JButton button=new JButton("변환");
		button.addActionListener(listener);
		panel.add(button);

		setVisible(true);}
	
	private class Mylistener implements ActionListener{
	 public void actionPerformed(ActionEvent e) {
		 JButton button=new JButton("변환");
	
		 if(e.getSource()==button)
			{
				int t=Integer.parseInt(field.getText());
				double k=t*1.609344;
			
			} }
	}

	public static void main(String[] args) {
		week03_02 w2=new week03_02();
	}
}