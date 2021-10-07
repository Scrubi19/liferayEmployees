<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/jsp/employee/menu.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEmployee" var="addEmployee"></portlet:actionURL>

<aui:form action="<%= addEmployee %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <%--        <aui:input name= "Employee_id" value="<%=editEmployee.getEmployeeId() %>" type="hidden" />--%>
        <aui:input name="First name"></aui:input>
        <aui:input name="Last name"></aui:input>
        <aui:input name="Middle name"></aui:input>
        <aui:input name="Gender"></aui:input>
        <aui:input name="Date of birth"></aui:input>
        <aui:input name="Date of employment"></aui:input>
        <aui:input name="Position id"></aui:input>
        <aui:input name="Salary"></aui:input>
        <aui:input name="Work phonenumber"></aui:input>
        <aui:input name="Mobil phonenumber"></aui:input>
        <aui:input name="Bank id"></aui:input>
        <aui:input name="Archive status"></aui:input>

    </aui:fieldset>

    <aui:button-row>

        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>

    </aui:button-row>
</aui:form>
