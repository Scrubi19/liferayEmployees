<%@include file="/html/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    banks bank = (banks) res.getObject();
    String bankID = String.valueOf(bank.getBank_id());
%>
<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentBankWithClients" var="getCurrentBankWithClientsURL">
        <portlet:param name="currentBankWithClientsID" value="<%=bankID%>" />
    </portlet:actionURL>
    <liferay-ui:icon image="Employees" message="Employees" url="<%=getCurrentBankWithClientsURL %>" />
</liferay-ui:icon-menu>