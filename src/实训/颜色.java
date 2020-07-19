package 实训;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class 颜色 {
	 public static void main(String[] args) throws Exception {
	        final JFrame jf = new JFrame("window");
	        jf.setSize(300, 300);
	        jf.setLocationRelativeTo(null);
	        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	        JPanel pal = new JPanel();

	       
	        final JLabel lab = new JLabel();
	        lab.setPreferredSize(new Dimension(150, 150));
	        lab.setOpaque(true);
	        pal.add(lab);

	        JButton btn = new JButton("choose color");
	        btn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                Color color = JColorChooser.showDialog(jf, "choose color", null);

	                // 如果用户取消或关闭窗口, 则返回的 color 为 null
	                if (color == null) {
	                    return;
	                }

	                // 把选取的颜色设置为标签的背景
	                lab.setBackground(color);

	                // 获取颜色的 ARGB 各个分量值
	                int alpha = color.getAlpha();
	                int red = color.getRed();
	                int green = color.getGreen();
	                int blue = color.getBlue();

	                lab.setText("A=" + String.format("%02x", alpha) + ", " +
	                        String.format("#%02x%02x%02x", red, green, blue));
	            }
	        });
	        pal.add(btn);

	        jf.setContentPane(pal);
	        jf.setVisible(true);
	    }

}
