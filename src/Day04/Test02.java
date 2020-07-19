package Day04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Day03.DBUtil;

public class Test02 {
	static void readImgToDB(){
		Connection conn=null;
		PreparedStatement stm=null;
		try {
			conn=DBUtil.getCnnoection();
			String sql=" insert into t1 (title,pho) values (?,?) ";   //后面的 引号与前面的括号 习惯空一格，避免语句长粘在一起
			
			stm=conn.prepareStatement(sql);
			stm.setString(1, "3");
			
			InputStream in=new FileInputStream("C:\\Users\\lenovo\\Pictures\\Camera Roll\\1.jpg");
			stm.setBinaryStream(2, in);
			
			stm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.free(null, stm, conn);
		}	
	}

	static void getImgToFile(){
		Connection conn=null;
		PreparedStatement stm=null;
		ResultSet rs=null; 
		try {
			conn=DBUtil.getCnnoection();
			String sql="select * from t1 where title=3"; 
			stm=conn.prepareStatement(sql);
			rs=stm.executeQuery();
			
			if(rs.next()){
				System.out.println(rs.getString("title"));
				
				InputStream in=rs.getBinaryStream("pho");
				OutputStream out=new FileOutputStream("e:/2.jpg");
				
				byte [] buff=new byte [1024];
				int len=0;
				while((len=in.read(buff))!=-1){
					out.write(buff,0,len);
				}		
				in.close();
				out.close();
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.free(rs, stm, conn);
		}
	}
	public static void main (String args[]) {
		
		readImgToDB();
		getImgToFile();
	}
	
}
