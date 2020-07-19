package 实训;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Day02test1 {
	 public static void main(String[] args) {
	        JFrame jframe = new JFrame("window");	       
	        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
	        // 第 1 个 JPanel, 使用默认的浮动布局
	        
	        JPanel panel01 = new JPanel();
	        panel01.add(new JLabel("用户名"));
	        panel01.add(new JTextField(10));

	        // 第 2 个 JPanel, 使用默认的浮动布局
	        JPanel panel02 = new JPanel();
	        panel02.add(new JLabel("密   码"));
	        panel02.add(new JPasswordField(10));

	        // 第 3 个 JPanel, 使用浮动布局, 并且容器内组件居中显示
	        JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	        panel03.add(new JButton("确认登录"));
	        

	        // 创建一个垂直盒子容器, 把上面 3 个 JPanel 串起来作为内容面板添加到窗口
	        Box vBox = Box.createVerticalBox();
	        vBox.add(panel01);
	        vBox.add(panel02);
	        vBox.add(panel03);

	        jframe.setContentPane(vBox);

	        jframe.pack();
	        jframe.setLocationRelativeTo(null);
	        jframe.setVisible(true);
	    }

}
