//Ä£ºý²éÑ¯
package Day03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Test04 {
	public static void main(String[] args) {
		List<Student> list = getList("Ð¡");
		for(Student stu :list){
			System.out.println(stu);
		}
	}
	
	public static List<Student> getList(String SName){
		List<Student> list = new ArrayList<Student>();
		Student stu =null;
		Connection conn = null;
		Statement stm = null;
		ResultSet rs =null;
		
		try {
			conn = DBUtil.getCnnoection();
			stm = conn.createStatement();
			String sql= "select * from sc where 1=1";
			
			if(!(SName == null || "".equals(SName))){
				sql += " and SName like '%"+SName+"%' ";
			}
			
			
			rs = stm.executeQuery(sql);
			while(rs.next()){
				stu = new Student();
				stu.setID(rs.getInt("ID"));
				stu.setSName(rs.getString("SName"));
				stu.setSSex(rs.getString("SSex"));
	     		list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.free(rs, stm, conn);
		}
		return list;
	}
	
}
