package 实训;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Windowtest {
	public static void main(String[] args) {
		JFrame jf = new JFrame("window");
		jf.setSize(500,500);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel pal = new JPanel();
		
		JButton btn = new JButton("请点击此按钮");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showNewWindow(jf);
			}
			
		});
		  pal.add(btn);

	      jf.setContentPane(pal);
	      jf.setVisible(true);
	}
	 public static void showNewWindow(JFrame relativeWindow) {
	       
	        JFrame newJFrame = new JFrame("new window");

	        newJFrame.setSize(250, 250);

	        
	        newJFrame.setLocationRelativeTo(relativeWindow);

	       
	        newJFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	        newJFrame.setResizable(false);

	        JPanel panel = new JPanel(new GridLayout(1, 1));

	     
	        /*JLabel label = new JLabel("window");
	        label.setFont(new Font(null, Font.PLAIN, 25));
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        label.setVerticalAlignment(SwingConstants.CENTER);
	        panel.add(label);*/

	        newJFrame.setContentPane(panel);
	        newJFrame.setVisible(true);
	 }
}
