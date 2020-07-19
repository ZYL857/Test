package ÊµÑµ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Day02 {
	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		  jframe.setLayout(null);
		  
		  JButton button = new JButton("²âÊÔ°´Å¥"); 
		  button.setBounds(100, 200, 200, 100);
		  jframe.add(button);
		  
		  // ¼àÌý°´Å¥ÊÂ¼þ 
		  button.addActionListener(new ActionListener() {
		  
		  @Override public void actionPerformed(ActionEvent e) { 
		  JOptionPane.showConfirmDialog(null, "choose:", "window", JOptionPane.YES_NO_OPTION); 
		  //JOptionPane.showMessageDialog(null, "¾¯¸æ£¡£¡", "´íÎó£¡£¡£¡", JOptionPane.ERROR_MESSAGE); 
		  } 
		  }
		  );
		 

		jframe.setSize(600, 600);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}
	
	}
