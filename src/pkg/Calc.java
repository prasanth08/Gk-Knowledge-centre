package pkg;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Calc {
	public Date getF() {
		return f;
	}

	public void setF(Date f) {
		this.f = f;
	}

	public Date getE() {
		return e;
	}

	public void setE(Date e) {
		this.e = e;
	}
	int sid;
	String fdate,edate;
	Date f,e;
	String reason;
	
	
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

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
	public String execute() throws ClassNotFoundException, SQLException  {

		
		f=Date.valueOf(fdate);
		e=Date.valueOf(edate);
	   Operations.acalc(this);
		return "success";
	}

}
