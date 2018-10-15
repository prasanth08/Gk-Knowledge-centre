package pkg;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;


public class Attendence {
 int sid;
 Date date;
 int status;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}public String execute() {
	
	
	long millis=System.currentTimeMillis();  
	 date=new java.sql.Date(millis);  
	
	
	Insert.insert(this);
	
	return "success";
}
 
 
}
