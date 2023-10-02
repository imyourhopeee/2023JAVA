import java.awt.event.ItemEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

interface ItemListener {
	void ItemListener();
}
public class week4_02 extends JPanel implements ItemListener{
	JCheckBox[] buttons=new JCheckBox[4];
	String[] items= {"엔진오일 교환","자동변속기오일교환","에어컨필터교환","타이어교환"};
	int[] prices= {4500,8000,30000,100000};
	int money=0;
	JPanel panel;
	JLabel label;
	
	public void week04_02() {
		super(); // 이 코드의 필요성.. 아니 왜 빨간줄이 뜰까
		panel=new JPanel();
		label=new JLabel();
		
		for (int i=0;i<(items.length);i++) {
			buttons[i]=new JCheckBox(items[i]);
			panel.add(buttons[i]);
		} // 
		int i=0;
		switch(buttons[i]) {
		case(button[0]==1){
			
		}
		}
		
		buttons[0].addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1)
				money=prices[0];
				label.setText("현재까지의 가격은"+money+"입니다");
			}
		})
		
	}
	
	@Override 
	public void listener() {
		void ItemListener() {money=1;}
	}
	public static void main(String[] args) {
		JFrame frame=new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		week4_02 w2=new week4_02();
		w2.setVisible(true);
		frame.setContentPane(w2);
		frame.setSize(500,200);
		frame.setVisible(true);
		

	}

}
