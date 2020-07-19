package 作业02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeftPanel extends JPanel{
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	public LeftPanel() {
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		this.setLayout(null);
		
		btn1 = new JButton("一");
		btn1.setBounds(10, 0, 80, 150);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = Tool.getMainframe();
				
			
				CenterPanel jpCenter = main.getCenterPanel();
				
				
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				jpCenter.add(new JLabel("组件"), BorderLayout.CENTER);
				
			
				jpCenter.revalidate();
				
				jpCenter.repaint();
			}
			
		});
		
		btn2 = new JButton("二");
		btn2.setBounds(10, 150, 80, 150);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = Tool.getMainframe();
				
			
				CenterPanel jpCenter = main.getCenterPanel();
				
			
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				jpCenter.add(new JLabel("组件"), BorderLayout.CENTER);
				
				
				jpCenter.revalidate();
				
				jpCenter.repaint();
			}
			
		});		
		
		
		btn3 = new JButton("三");
		btn3.setBounds(10, 300, 80, 200);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = Tool.getMainframe();
				
				
				CenterPanel jpCenter = main.getCenterPanel();
				
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				jpCenter.add(new JLabel("组件"), BorderLayout.CENTER);
			
				jpCenter.revalidate();
			
				jpCenter.repaint();
			}
			
		});			
		
		add(btn1);
		add(btn2);
		add(btn3);
		
	}	
}
