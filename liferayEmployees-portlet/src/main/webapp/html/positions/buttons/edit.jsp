<%@include file="/html/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    positions position = (positions) res.getObject();
    String positionID = String.valueOf(position.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentPosition" var="getCurrentPositionURL">
        <portlet:param name="currentPositionID" value="<%=positionID%>" />
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentPositionURL %>" />
</liferay-ui:icon-menu>