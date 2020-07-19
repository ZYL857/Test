package Day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Atime {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("bnm");
		stu.setPassword("asc");
		stu.setBirthday(new Date());
		int result = addStudent(stu);
		if(result >0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		
		System.out.println(stu);
	}
	
	public static int addStudent(Student stu){
		Connection conn = null;
		PreparedStatement stm = null;
		int result = 0;
		
		try {
			conn = DBUtil.getCnnoection();
			String sql="insert into login(Name,password,birthday) values(?,?,?)";
			stm = conn.prepareStatement(sql);
			stm.setString(1, stu.getName());
			stm.setString(2, stu.getPassword());
			stm.setDate(3,new java.sql.Date(stu.getBirthday().getTime()));   //需要转换
			result = stm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.free(null, stm, conn);
		}
		
		return result;
	}
	
	public static Student selStudent(){
		Connection conn = null;
		PreparedStatement stm = null;
		Student stu =null;
		ResultSet rs =null;
		try {
			conn = DBUtil.getCnnoection();
			String sql="select * from login where Name=9";
			stm = conn.prepareStatement(sql);
			rs = stm.executeQuery();
			while(rs.next()){
				stu = new Student();
				stu.setName(rs.getString("Name"));
				stu.setBirthday(rs.getDate("birthday"));  //这个地方不需要转换了
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.free(rs, stm, conn);
		}
		return stu;
	}
}
