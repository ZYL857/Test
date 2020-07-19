package Day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用户名");
		String SName = scan.nextLine();
		System.out.println("输入密码");
		String password = scan.nextLine();
		
		Test03student stu = getLogin(SName,password);
		if(stu==null) {
			System.out.println("失败");
		}else {
			System.out.println("成功");
		}
		
	}
	public static Test03student getLogin(String SName , String password) {
		Test03student stu = null;
		 Connection conn= null;
		 PreparedStatement stm= null;
		 ResultSet rs = null;
		 try {
				conn = DBUtil.getCnnoection();
				String sql = "select * from login where SName = ? and password=?";  //第四处
				stm = conn.prepareStatement(sql);  //第二处
				stm.setString(1, SName);  //第三处
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
