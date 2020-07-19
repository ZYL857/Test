package Day03;

public class Iofo {
	private int SNo;
	private String SName;
	private String SSex;
	
	
	public int getSNo() {
		return this.SNo;
	}
	public void setSNo(int sNo) {
		this.SNo = sNo;
	}
	public String getSName() {
		return this.SName;
	}
	public void setSName(String sName) {
		this.SName = sName;
	}
	public String getSSex() {
		return this.SSex;
	}
	public void setSSex(String sSex) {
		this.SSex = sSex;
	}
	@Override
	public String toString() {
		return "Info [SNo=" + this.SNo + ", SName=" + this.SName + ", SSex=" + this.SSex + "]";
	}
	
	
}
