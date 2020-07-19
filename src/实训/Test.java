package 实训;

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
			
			JFrame frame = new JFrame("窗口");   //创建窗体，带标题
			frame.setLocation(100, 100);   //设置位置
			frame.setSize(800, 500);    //设置大小
			
			frame.setLayout(new FlowLayout());   //设置流式布局
			
			
			//获得内容面板
			Container con = frame.getContentPane();
			
			//在内容面板中添加组件
			
			//添加文本
			JLabel label_username = new JLabel("用户名:");
			JLabel label_image = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Pictures\\Camera Roll\\1.jpg"));  //设置标签图片
			con.add(label_username);
			con.add(label_image);
			//添加文本框
			JTextField userName = new JTextField();
			userName.setText("123");
			System.out.println(userName.getText());    //得到文本框中的值
			con.add(userName);
			
			//设置文本域
			JTextArea textArea = new JTextArea(10,10); 
			textArea.setText("请阅读：");
			textArea.append("文本");  //追加文本
			con.add(textArea);
			
			//设置按钮
			JButton button = new JButton("添加");
			con.add(button);
			
			//设置复选框
			JCheckBox checkbox = new JCheckBox("选择",true);
			System.out.println(checkbox.getText());
			con.add(checkbox);
			
			//设置单选按钮
			JRadioButton radio1 = new JRadioButton("男",true);
			con.add(radio1);
			JRadioButton radio2 = new JRadioButton("女",false);
			con.add(radio2);
			
			//设置单选按钮组
			ButtonGroup bg = new ButtonGroup();
			bg.add(radio1);
			bg.add(radio2);
			
			//设置下拉列表
			String [] items = {"选项1","选项2"};
			JComboBox<String> sel = new JComboBox<String>(items);
			sel.addItem("选项3");
			sel.setSelectedIndex(2);  //按索引设置默认项
			System.out.println(sel.getSelectedItem());
			con.add(sel);
			
			//设置表格
			//没有显示列名
			String [] colName = {"姓名","性别","年龄","分数"}; 
			DefaultTableModel dt = new DefaultTableModel(colName,0);
			
			dt.addRow(new String[]{"Tom","男","16","95"});
			dt.addRow(new String[]{"Peter","男","18","94"});
			dt.addRow(new String[]{"lucky","女","17","94"});
			
			JTable table = new JTable(dt);
			table.setRowHeight(60);
			
			JScrollPane jp = new JScrollPane(table);   //设置滚动面板
			jp.setPreferredSize(new Dimension(400, 200));  //设置滚动面板大小
			frame.add(jp);  //在窗体中添加滚动面板
			
			//设置菜单
			JMenuBar menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			
			JMenu menu1 = new JMenu("文件");  //一级菜单
			JMenu menu2 = new JMenu("关于");
			
			menuBar.add(menu1);
			menuBar.add(menu2);
			
			menu1.add(new JMenuItem("打开")); //添加二级菜单
			menu1.add(new JMenuItem("保存")); //添加二级菜单
			menu2.add(new JMenuItem("反馈"));
			
			frame.setVisible(true);  //设置窗体可见
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //设置右上角关闭按钮 关闭窗体
			
		
	} 	
}
