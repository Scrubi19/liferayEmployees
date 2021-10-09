<%@include file="/html/init.jsp"%>

<aui:button-row cssClass="positions_menu">
    <portlet:renderURL var="printAllPositions">
        <portlet:param name="mvcPath" value="/html/positions/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllPositions %>" value="Show current Positions"/>

    <portlet:renderURL var="Archive">
        <portlet:param name="mvcPath" value="/html/positions/archive.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= Archive %>" value="Archive"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>