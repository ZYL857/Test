package ʵѵ;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Test {
		public static void main(String[] args) {
			
			JFrame frame = new JFrame("����");   //�������壬������
			frame.setLocation(100, 100);   //����λ��
			frame.setSize(800, 500);    //���ô�С
			
			frame.setLayout(new FlowLayout());   //������ʽ����
			
			
			//����������
			Container con = frame.getContentPane();
			
			//�����������������
			
			//����ı�
			JLabel label_username = new JLabel("�û���:");
			JLabel label_image = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Pictures\\Camera Roll\\1.jpg"));  //���ñ�ǩͼƬ
			con.add(label_username);
			con.add(label_image);
			//����ı���
			JTextField userName = new JTextField();
			userName.setText("123");
			System.out.println(userName.getText());    //�õ��ı����е�ֵ
			con.add(userName);
			
			//�����ı���
			JTextArea textArea = new JTextArea(10,10); 
			textArea.setText("���Ķ���");
			textArea.append("�ı�");  //׷���ı�
			con.add(textArea);
			
			//���ð�ť
			JButton button = new JButton("���");
			con.add(button);
			
			//���ø�ѡ��
			JCheckBox checkbox = new JCheckBox("ѡ��",true);
			System.out.println(checkbox.getText());
			con.add(checkbox);
			
			//���õ�ѡ��ť
			JRadioButton radio1 = new JRadioButton("��",true);
			con.add(radio1);
			JRadioButton radio2 = new JRadioButton("Ů",false);
			con.add(radio2);
			
			//���õ�ѡ��ť��
			ButtonGroup bg = new ButtonGroup();
			bg.add(radio1);
			bg.add(radio2);
			
			//���������б�
			String [] items = {"ѡ��1","ѡ��2"};
			JComboBox<String> sel = new JComboBox<String>(items);
			sel.addItem("ѡ��3");
			sel.setSelectedIndex(2);  //����������Ĭ����
			System.out.println(sel.getSelectedItem());
			con.add(sel);
			
			//���ñ��
			//û����ʾ����
			String [] colName = {"����","�Ա�","����","����"}; 
			DefaultTableModel dt = new DefaultTableModel(colName,0);
			
			dt.addRow(new String[]{"Tom","��","16","95"});
			dt.addRow(new String[]{"Peter","��","18","94"});
			dt.addRow(new String[]{"lucky","Ů","17","94"});
			
			JTable table = new JTable(dt);
			table.setRowHeight(60);
			
			JScrollPane jp = new JScrollPane(table);   //���ù������
			jp.setPreferredSize(new Dimension(400, 200));  //���ù�������С
			frame.add(jp);  //�ڴ�������ӹ������
			
			//���ò˵�
			JMenuBar menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			
			JMenu menu1 = new JMenu("�ļ�");  //һ���˵�
			JMenu menu2 = new JMenu("����");
			
			menuBar.add(menu1);
			menuBar.add(menu2);
			
			menu1.add(new JMenuItem("��")); //��Ӷ����˵�
			menu1.add(new JMenuItem("����")); //��Ӷ����˵�
			menu2.add(new JMenuItem("����"));
			
			frame.setVisible(true);  //���ô���ɼ�
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //�������Ͻǹرհ�ť �رմ���
			
		
	} 	
}
