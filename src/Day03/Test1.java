package Day03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1)���� 
		
		//2)ע�������� 
		Class.forName("com.mysql.jdbc.Driver");
		
		//3)�������� ע��,Ҫ��java.sql���µ�

		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sm", "root", "admin");
		
		//4)�������ݴ������ 
		Statement stm=conn.createStatement();
		
		//5)ִ�в�ѯ,ȡ�ý��������
		ResultSet rs=stm.executeQuery("select * from SC");
		   
		while(rs.next()){
			int id=rs.getInt("ID");
			String name=rs.getString("SName");
			String sex=rs.getString("SSex");
				
			System.out.println("ѧ����:[  "+id+"\t����"+name+"]");	
		}
		
		//������Դ
		rs.close();
		stm.close();
		conn.close();  
	}
}
