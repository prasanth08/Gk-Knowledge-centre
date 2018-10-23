<%@ taglib prefix="s" uri="/struts-tags"%>  
<s:form action="click">  
<s:textfield name="sid" label="sid"></s:textfield> 

<s:radio name="status" label="absent" list="#{'1':'Late','0':'Absent'}"/>
<s:select label="Reason" 
headerKey="-1" headerValue="Select Reason"
list="#{'Medical': 'Medical','Travel':'Travel','Interview':'Interview','Family Emergency':'Family Emergency','Other':'Other'}"
name="reason"
value="0"/>

<s:submit value="submit" ></s:submit>
</s:form>