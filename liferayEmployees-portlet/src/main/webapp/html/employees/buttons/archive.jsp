<%@include file="/html/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    employees employee = (employees) res.getObject();
    String employeeID = String.valueOf(employee.getPrimaryKey());
    String employeeFlag = String.valueOf(employee.getArchive_status());

%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="swapEmployeeByArchive" var="swapEmployeeByArchiveURL">
        <portlet:param name="currentEmployeeID" value="<%=employeeID%>" />
        <portlet:param name="currentEmployeeFlag" value="<%=employeeFlag%>" />
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Add/remove to/from Archive" url="<%= swapEmployeeByArchiveURL %>" />
</liferay-ui:icon-menu>