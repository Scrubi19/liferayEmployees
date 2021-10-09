<%@include file="/html/init.jsp"%>

<%
  ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
  positions position = (positions) res.getObject();
  String positionID = String.valueOf(position.getPrimaryKey());
  String positionFlag = String.valueOf(position.getArchive_status());

%>

<liferay-ui:icon-menu>
  <portlet:actionURL name="swapPositionByArchive" var="swapPositionByArchiveURL">
    <portlet:param name="currentPositionID" value="<%=positionID%>" />
    <portlet:param name="currentPositionFlag" value="<%=positionFlag%>" />
  </portlet:actionURL>
  <liferay-ui:icon image="edit" message="Add/remove to/from archive" url="<%= swapPositionByArchiveURL %>" />
</liferay-ui:icon-menu>