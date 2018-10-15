package pkg;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Calc {
	int sid;
	String fdate,edate;
	Date f,e;
	
	
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		System.out.println(sid);
		this.sid = sid;
		
	}
	
	public String getFdate() {
		
		return fdate;
		
	}
	public void setFdate(String fdate) {
		System.out.println(fdate);
		this.fdate = fdate;
	}
	public String getEdate() {
		return edate;
	}
	
	public void setEdate(String edate) {
		System.out.println(edate);
		this.edate = edate;
	}
	public String execute()  {

		
		f=Date.valueOf(fdate);
		e=Date.valueOf(edate);
		return "success";
	}

}
