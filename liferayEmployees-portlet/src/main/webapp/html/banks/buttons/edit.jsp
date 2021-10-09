<%@include file="/html/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    banks bank = (banks) res.getObject();
    String bankID = String.valueOf(bank.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentBank" var="getCurrentBankURL">
        <portlet:param name="currentBankID" value="<%=bankID%>" />
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentBankURL %>" />
</liferay-ui:icon-menu>