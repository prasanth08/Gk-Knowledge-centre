package pkg;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;


public class Attendence {
 int sid;
 Date date;
 int absent;
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
public int getAbsent() {
	return absent;
}
public void setAbsent(int absent) {
	this.absent = absent;
}public String execute() {
	
	
	long millis=System.currentTimeMillis();  
	 date=new java.sql.Date(millis);  
	
	
	Insert.insert(this);
	
	return "success";
}
 
 
}
