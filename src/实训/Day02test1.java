package ʵѵ;

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
         
	        // �� 1 �� JPanel, ʹ��Ĭ�ϵĸ�������
	        
	        JPanel panel01 = new JPanel();
	        panel01.add(new JLabel("�û���"));
	        panel01.add(new JTextField(10));

	        // �� 2 �� JPanel, ʹ��Ĭ�ϵĸ�������
	        JPanel panel02 = new JPanel();
	        panel02.add(new JLabel("��   ��"));
	        panel02.add(new JPasswordField(10));

	        // �� 3 �� JPanel, ʹ�ø�������, �������������������ʾ
	        JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	        panel03.add(new JButton("ȷ�ϵ�¼"));
	        

	        // ����һ����ֱ��������, ������ 3 �� JPanel ��������Ϊ���������ӵ�����
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
