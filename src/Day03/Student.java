package Day03;

import java.util.Date;

public class Student {
	
	    private int ID;
	    private String SName;
	    private String SSex;
	    private String Name;
	    private String Password;
	    private Date Birthday;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getSName() {
			return SName;
		}
		public void setSName(String sName) {
			SName = sName;
		}
		public String getSSex() {
			return SSex;
		}
		public void setSSex(String sSex) {
			SSex = sSex;
		}
		
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public Date getBirthday() {
			return Birthday;
		}
		public void setBirthday(Date birthday) {
			Birthday = birthday;
		}
		public String toString() {
			String str = "姓名："+this.SName + " 性别："+this.SSex+" 学号："+this.ID;
			return str.toString();
		}

}
