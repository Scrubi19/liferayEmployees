<%@include file="/html/init.jsp"%>

<jsp:useBean id="currentBank" type="ru.bulatov.liferay.model.banks" scope="request" />

<portlet:actionURL name="updateBank" var="updateBankURL"/>
<aui:form  action="<%= updateBankURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="key" value="<%=currentBank.getBank_id() %>" type="hidden" />
        <aui:input name="Bank name" value="<%= currentBank.getBank_name() %>" type="hidden" />
        <aui:input name="BIC" value="<%=currentBank.getBik() %>"/>
        <aui:input name="Address bank" value="<%=currentBank.getBank_address() %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>