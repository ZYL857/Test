package ʵѵ;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class �Ի��� {
	public static void main(String[] args) {
		JFrame jf = new JFrame("window");
		jf.setSize(500,500);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel pal = new JPanel();
		
		JButton btn = new JButton("�����˰�ť");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Object[] op = new Object[] {"1","2","3"};
			/* 1. ��Ϣ�Ի�����Ϣ��Ϣ��
			 * JOptionPane.showMessageDialog(
                     jf,
                     "Hello Information Message",
                     "��Ϣ����",
                     JOptionPane.INFORMATION_MESSAGE
             );
             2.ȷ�϶Ի���
                 int result = JOptionPane.showConfirmDialog(
                        jf,
                        "ȷ��ɾ����",
                        "��ʾ",
                        JOptionPane.YES_NO_CANCEL_OPTION
                );
                System.out.println("ѡ����: " + result);
              3. ����Ի����ı������룩
              String inputContent = JOptionPane.showInputDialog(
                        jf,
                        "�����������:",
                        "Ĭ������"
                );
                System.out.println("���������: " + inputContent);
              4. ѡ��Ի���
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
