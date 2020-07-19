package Day04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Day03.DBUtil;

public class Test01 {
	static void clobDemo(){
		Connection conn= null;
		PreparedStatement stm=null;					
		try {
			conn=DBUtil.getCnnoection();
			String sql="insert into t1 (title,con) values ( ?,?)";
			stm=conn.prepareStatement(sql);
			stm.setString(1, "123");
			Reader r=new FileReader("d:/test.txt");
			stm.setCharacterStream(2, r);   		
			stm.executeUpdate();
			r.close();									
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.free(null, stm, conn);
		}
	}				
	static void clobReadDemo(){
		Connection conn= null;
		PreparedStatement stm=null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getCnnoection();
			String sql="select * from t1 where title=123";  
			stm=conn.prepareStatement(sql);
	    rs=stm.executeQuery();
	    if( rs.next()){  
		    System.out.println(rs.getString("title"));   
		    Reader r=rs.getCharacterStream("con");   //对象不是一个，上面的是Statement对象，这个是ResultSet对象
		    BufferedReader br=new BufferedReader(r);
		    BufferedWriter bw=new BufferedWriter(new FileWriter("e:/dest.txt"));
		    String str=null;
		    while((str=br.readLine())!=null){
		    	bw.write(str);
		    	bw.newLine();
		    	bw.flush();
		    }						    
		    br.close();
		    bw.close();
	    }   
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.free(rs, stm, conn);
		}
	}	
	public static void main(String args[]) {
		clobDemo();
		clobReadDemo();
		
		
	}
}
