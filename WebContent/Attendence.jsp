<%@ taglib prefix="s" uri="/struts-tags"%>  
<s:form action="click">  
<s:textfield name="sid" label="sid"></s:textfield> 

<s:radio name="absent" label="absent" list="#{'0':'Present','1':'Absent'}"/>
<s:submit value="submit" ></s:submit>
</s:form>