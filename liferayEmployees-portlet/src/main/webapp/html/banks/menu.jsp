<%@include file="/html/init.jsp"%>

<aui:button-row cssClass="banks_menu">
    <portlet:renderURL var="printAllBanks">
        <portlet:param name="mvcPath" value="/html/banks/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllBanks %>" value="Show All Banks"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>