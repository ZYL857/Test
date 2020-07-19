package Day03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1)导包 
		
		//2)注册驱动类 
		Class.forName("com.mysql.jdbc.Driver");
		
		//3)创建连接 注意,要导java.sql包下的

		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sm", "root", "admin");
		
		//4)创建数据传输对象 
		Statement stm=conn.createStatement();
		
		//5)执行查询,取得结果集对象
		ResultSet rs=stm.executeQuery("select * from SC");
		   
		while(rs.next()){
			int id=rs.getInt("ID");
			String name=rs.getString("SName");
			String sex=rs.getString("SSex");
				
			System.out.println("学生表:[  "+id+"\t姓名"+name+"]");	
		}
		
		//清理资源
		rs.close();
		stm.close();
		conn.close();  
	}
}
