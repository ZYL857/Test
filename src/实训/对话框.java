package 实训;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class 对话框 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("window");
		jf.setSize(500,500);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel pal = new JPanel();
		
		JButton btn = new JButton("请点击此按钮");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Object[] op = new Object[] {"1","2","3"};
			/* 1. 消息对话框（信息消息）
			 * JOptionPane.showMessageDialog(
                     jf,
                     "Hello Information Message",
                     "消息标题",
                     JOptionPane.INFORMATION_MESSAGE
             );
             2.确认对话框
                 int result = JOptionPane.showConfirmDialog(
                        jf,
                        "确认删除？",
                        "提示",
                        JOptionPane.YES_NO_CANCEL_OPTION
                );
                System.out.println("选择结果: " + result);
              3. 输入对话框（文本框输入）
              String inputContent = JOptionPane.showInputDialog(
                        jf,
                        "输入你的名字:",
                        "默认内容"
                );
                System.out.println("输入的内容: " + inputContent);
              4. 选项对话框
             */

			int optionSelected = JOptionPane.showOptionDialog(null, "", "", 
					JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, 
					null, op, op[0]);
			}});
		  pal.add(btn);

	      jf.setContentPane(pal);
	      jf.setVisible(true);
	}
	
}
