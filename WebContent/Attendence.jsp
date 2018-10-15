<%@ taglib prefix="s" uri="/struts-tags"%>  
<s:form action="click">  
<s:textfield name="sid" label="sid"></s:textfield> 

<s:radio name="status" label="absent" list="#{'1':'Present','0':'Absent'}"/>
<s:submit value="submit" ></s:submit>
</s:form>