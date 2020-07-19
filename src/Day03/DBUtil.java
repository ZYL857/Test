package Day03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
		private DBUtil() {}
		
		private static final String DRIVER= "com.mysql.jdbc.Driver";
		private static final String URL= "jdbc:mysql://localhost:3306/sm";
		private static final String USER= "root";
		private static final String PASSWORD= "admin";

		static {
			try {
				Class.forName(DRIVER);
			}catch (Exception e) {
			}
		}
		
		
		public static Connection getCnnoection() {
			Connection conn=null;
			try{
				conn = DriverManager.getConnection(URL,USER,PASSWORD);
			}catch (Exception e) {
				
			}
			return conn;
		}
		
		
		public static void free(ResultSet rs , Statement stmt , Connection conn) {
			try {
				if(rs != null) {
				rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(stmt != null) {
						stmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(conn != null) {
							conn.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}finally {
							
					}	
				}
		
			}
		}
}
