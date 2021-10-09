<%@include file="/html/init.jsp"%>

<aui:button-row cssClass="employees_menu">

    <portlet:renderURL var="printAllEmployees">
        <portlet:param name="mvcPath" value="/html/employees/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllEmployees %>" value="Show current Employees"/>

    <portlet:renderURL var="Archive">
        <portlet:param name="mvcPath" value="/html/employees/archive.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= Archive %>" value="Archive"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>

</aui:button-row>

