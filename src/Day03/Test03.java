package Day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������û���");
		String SName = scan.nextLine();
		System.out.println("��������");
		String password = scan.nextLine();
		
		Test03student stu = getLogin(SName,password);
		if(stu==null) {
			System.out.println("ʧ��");
		}else {
			System.out.println("�ɹ�");
		}
		
	}
	public static Test03student getLogin(String SName , String password) {
		Test03student stu = null;
		 Connection conn= null;
		 PreparedStatement stm= null;
		 ResultSet rs = null;
		 try {
				conn = DBUtil.getCnnoection();
				String sql = "select * from login where SName = ? and password=?";  //���Ĵ�
				stm = conn.prepareStatement(sql);  //�ڶ���
				stm.setString(1, SName);  //������
				stm.setString(2, password); 
				rs = stm.executeQuery();   
				if(rs.next()){
					stu = new Test03student();
					stu.setSName(rs.getString("SName"));
					stu.setSSex(rs.getString("password"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				DBUtil.free(rs, stm, conn);
			}
			return stu;
	}
}
