package ru.bulatov.liferay.portlet;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class Employees extends MVCPortlet {

    public void addEmployee(ActionRequest request, ActionResponse response) {
        String lastname = ParamUtil.getString(request, "Last name");
        String firstname = ParamUtil.getString(request, "First name");
        String middlestname = ParamUtil.getString(request, "Middle name");
        String birthdate = ParamUtil.getString(request, "Birthdate");
        String employmentDate = ParamUtil.getString(request, "Employment date");
        String workNumber = ParamUtil.getString(request, "Work number");
        String mobileNumber = ParamUtil.getString(request, "Mobile number");
        int salary = ParamUtil.getInteger(request, "Salary");
        String workPosition = ParamUtil.getString(request, "Work position");
        String nameBank = ParamUtil.getString(request, "Bank name");
        Long bic = ParamUtil.getLong(request, "BIC");
        String addressBank = ParamUtil.getString(request, "Address bank");

    }

    public void editEmployee(ActionRequest request, ActionResponse response) {

    }

    public void editArchiveForEmployee(ActionRequest request, ActionResponse response) {

    }

}
