<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addEmployeeURL">
    <portlet:param name="mvcPath" value="/html/employees/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addEmployee" var="addEmployeeURL"/>

<aui:form action="<%= addEmployeeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="First name"/>
        <aui:input name="Last name"/>
        <aui:input name="Middle name"/>
        <aui:input name="Gender"/>
        <aui:input name="Date of birth"/>
        <aui:input name="Date of employment"/>
        <aui:input name="Position id"/>
        <aui:input name="Salary"/>
        <aui:input name="Work phonenumber"/>
        <aui:input name="Mobile phonenumber"/>
        <aui:input name="Bank id"/>
        <aui:input name="Archive status"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addEmployeeURL %>"/>

    </aui:button-row>
</aui:form>
