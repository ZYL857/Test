package Day03;
//crud
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Test02 {
	public static void main(String[] args) {
		Iofo student = new Iofo();
		
		  student.setSName("小王"); student.setSNo(18045529); student.setSSex("男");
		  
		  
		  int result = addUser(student); if(result == 1) {
		  System.out.println("数据插入成功"); }else { System.out.println("数据插入失败"); }
		 
		 
		
	}
	

	public static int addUser(Iofo massage) {
		int result = 0;
		
		Connection conn = null;
		Statement stm = null;
	
		try {
			conn = DBUtil.getCnnoection();
			stm = conn.createStatement();
			
			String sql = "insert into SC(ID,SName,SSex) values('"+massage.getSNo()+"','"+massage.getSName()+"','"+massage.getSSex()+"');";
			System.out.println(sql);
			result = stm.executeUpdate(sql);
		}catch (Exception e) {
			
		}finally {
			DBUtil.free(null, stm, conn);
		}
		return result;
	}
	
	
	
	public static int deleteUser(Iofo massage) {
		int result = 0;
		
		Connection conn = null;
		Statement stm = null;
	
		try {
			conn = DBUtil.getCnnoection();
			stm = conn.createStatement();
			
			String sql = "delete from SC where SNo="+massage.getSNo()+";";
			System.out.println(sql);
			result = stm.executeUpdate(sql);
		}catch (Exception e) {
		
		}finally {
			DBUtil.free(null, stm, conn);
		}
		return result;
	}
	

	public static int updateUser(Iofo user) {
		int result = 0;
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DBUtil.getCnnoection();
			stm = conn.createStatement();
			String sql = "update SC set SName=小王"+"where ID="+user.getSNo();
			result = stm.executeUpdate(sql);
		}catch (Exception e) {
		
			e.printStackTrace();
		}finally {
			DBUtil.free(null, stm, conn);
		}
		
		return result;
	}
	
	
	public static Iofo getUser(String sex) {
		Iofo user = null;
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			conn=DBUtil.getCnnoection();
			stm = conn.createStatement();
			String sql = "select * from SC where SSex='"+sex+"'";
			rs = stm.executeQuery(sql);
			while(rs.next()) {
				user = new Iofo();
				user.setSNo(rs.getInt("ID"));
				user.setSName(rs.getString("SName"));
				user.setSSex(rs.getString("SSex"));
				System.out.println(user);
			}
			
		}catch (Exception e) {
			
		}finally {
			DBUtil.free(rs, stm, conn);
		}
		return user;
	}
	
}