package 作业02;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame{

	public static void main(String[] args) {
		new MainFrame();
	}
	
	private CenterPanel centerPanel = null;
	private LeftPanel leftPanel =null;
	
	public MainFrame(){
		
		setTitle("测试系统");
		
		setSize(800, 500);
		
		
		initPanel();
		
		
		initCenterPanel();
		
		Tool.setMainframe(this);
		
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public CenterPanel getCenterPanel() {
		return centerPanel;
	}
	
	
	private void initCenterPanel() {
		centerPanel = new CenterPanel();
		JLabel label = new JLabel("window");
		centerPanel.add(label);
		this.add(centerPanel, BorderLayout.CENTER);
	}
	
	
	private void initPanel() {
		leftPanel = new LeftPanel();
		leftPanel.setPreferredSize(new Dimension(120,575));
		this.add(leftPanel,BorderLayout.WEST);
	}
	
}
