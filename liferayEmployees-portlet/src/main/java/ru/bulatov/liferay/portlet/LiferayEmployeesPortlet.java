package ru.bulatov.liferay.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import ru.bulatov.liferay.model.banks;
import ru.bulatov.liferay.model.employees;
import ru.bulatov.liferay.model.impl.banksImpl;
import ru.bulatov.liferay.model.impl.employeesImpl;
import ru.bulatov.liferay.model.impl.positionsImpl;
import ru.bulatov.liferay.model.positions;
import ru.bulatov.liferay.service.banksLocalServiceUtil;
import ru.bulatov.liferay.service.employeesLocalServiceUtil;
import ru.bulatov.liferay.service.positionsLocalServiceUtil;

public class LiferayEmployeesPortlet extends MVCPortlet {
    // Add operations for Employees, Bank, Positions
    public void addEmployee(ActionRequest request, ActionResponse response) {
        employees employee = new employeesImpl();
        try {
            employee.setEmployee_id(employeesLocalServiceUtil.getemployeesesCount()+1);
            employee.setFirstname(ParamUtil.getString(request, "First name"));
            employee.setLastname(ParamUtil.getString(request, "Last name"));
            employee.setMiddlename(ParamUtil.getString(request, "Middle name"));

            employee.setGender(ParamUtil.getString(request, "Gender"));

            employee.setDate_of_birth(ParamUtil.getString(request, "Date of birth"));
            employee.setDate_of_employment(ParamUtil.getString(request, "Date of employment"));

            employee.setPosition_id(ParamUtil.getInteger(request, "Position id"));
            employee.setSalary(ParamUtil.getInteger(request, "Salary"));
            employee.setBank_id(ParamUtil.getInteger(request, "Bank id"));

            employee.setWork_phonenumber(ParamUtil.getString(request, "Work phonenumber"));
            employee.setMobile_phonenumber(ParamUtil.getString(request, "Mobile phonenumber"));

            employee.setArchive_status(ParamUtil.getBoolean(request, "Archive status"));

            employeesLocalServiceUtil.addemployees(employee);
            response.setRenderParameter("jspPage", "/html/employees/all.jsp");
        } catch (Exception e) {
            System.out.println("Exception"+e+" was caught");
            e.printStackTrace();
        }
    }

    public void addBank(ActionRequest request, ActionResponse response) {
        banks bank = new banksImpl();

        try {
            bank.setBank_id(banksLocalServiceUtil.getbanksesCount()+1);
            bank.setBank_name(ParamUtil.getString(request, "Bank name"));
            bank.setBik(ParamUtil.getString(request, "BIC"));
            bank.setBank_address(ParamUtil.getString(request, "Address"));

            banksLocalServiceUtil.addbanks(bank);
            response.setRenderParameter("jspPage", "/html/banks/all.jsp");
        } catch (Exception e) {
            System.out.println("Exception"+e+" was caught");
            e.printStackTrace();
        }
    }

    public void addPosition(ActionRequest request, ActionResponse response) {
        positions position = new positionsImpl();

        try {
            position.setPosition_id(positionsLocalServiceUtil.getpositionsesCount()+1);
            position.setPosition_name(ParamUtil.getString(request, "Position name"));
            position.setArchive_status(ParamUtil.getBoolean(request, "Archive status"));

            positionsLocalServiceUtil.addpositions(position);
            response.setRenderParameter("jspPage", "/html/positions/all.jsp");
        } catch (Exception e) {
            System.out.println("Exception"+e+" was caught");
            e.printStackTrace();
        }
    }

    // Edit operations for Employees, Bank, Positions

    public void getCurrentEmployee(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        employees currentEmployee = employeesLocalServiceUtil.
                getemployees(Long.parseLong(request.getParameter("currentEmployeeID")));
        request.setAttribute("currentEmployee", currentEmployee);

        response.setRenderParameter("jspPage", "/html/employees/edit.jsp");
    }
    public void updateEmployee(ActionRequest request, ActionResponse response) throws SystemException {
        employees employee = new employeesImpl();
        employee.setEmployee_id(ParamUtil.getLong(request, "key"));

        employee.setFirstname(ParamUtil.getString(request, "First name"));
        employee.setLastname(ParamUtil.getString(request, "Last name"));
        employee.setMiddlename(ParamUtil.getString(request, "Middle name"));
        employee.setGender(ParamUtil.getString(request, "Gender"));
        employee.setDate_of_birth(ParamUtil.getString(request, "Date of birth"));
        employee.setDate_of_employment(ParamUtil.getString(request, "Date of employment"));
        employee.setPosition_id(ParamUtil.getInteger(request, "Position id"));
        employee.setSalary(ParamUtil.getInteger(request, "Salary"));
        employee.setBank_id(ParamUtil.getInteger(request, "Bank id"));
        employee.setWork_phonenumber(ParamUtil.getString(request, "Work phonenumber"));
        employee.setMobile_phonenumber(ParamUtil.getString(request, "Mobile phonenumber"));
        employee.setArchive_status(ParamUtil.getBoolean(request, "Archive status"));

        employeesLocalServiceUtil.updateemployees(employee);
        response.setRenderParameter("jspPage", "/html/employees/menu.jsp");
    }

    public void getCurrentBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        String bankID = request.getParameter("currentBankID");
        banks currentBank = banksLocalServiceUtil.getbanks(Long.parseLong(bankID));
        request.setAttribute("currentBank", currentBank);
        response.setRenderParameter("jspPage", "/html/banks/edit.jsp");
    }
    public void updateBank(ActionRequest request, ActionResponse response) throws SystemException {
        banks bank = new banksImpl();
        bank.setBank_id(ParamUtil.getLong(request, "key"));
        bank.setBank_name(ParamUtil.getString(request, "Bank name"));
        bank.setBik(ParamUtil.getString(request, "BIC"));
        bank.setBank_address(ParamUtil.getString(request, "Address bank"));

        banksLocalServiceUtil.updatebanks(bank);

        response.setRenderParameter("jspPage", "/html/banks/all.jsp");
    }

    public void getCurrentPosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        positions currentPosition = positionsLocalServiceUtil.
                getpositions(Long.parseLong(request.getParameter("currentPositionID")));

        request.setAttribute("currentPosition", currentPosition);

        response.setRenderParameter("jspPage", "/html/positions/edit.jsp");
    }
    public void updatePosition(ActionRequest request, ActionResponse response) throws SystemException {
        positions position = new positionsImpl();
        position.setPosition_id(ParamUtil.getLong(request, "key"));
        position.setPosition_name(ParamUtil.getString(request, "Position name"));
        position.setArchive_status(ParamUtil.getBoolean(request, "Archive status"));

        positionsLocalServiceUtil.updatepositions(position);

        response.setRenderParameter("jspPage", "/html/positions/menu.jsp");
    }

    // Flag operations

    public void swapEmployeeByArchive(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        employees currentEmployee = employeesLocalServiceUtil.
                getemployees(Long.parseLong(request.getParameter("currentEmployeeID")));

        currentEmployee.setArchive_status(!request.getParameter("currentEmployeeFlag").equals("true"));

        employeesLocalServiceUtil.updateemployees(currentEmployee);
        response.setRenderParameter("jspPage", "/html/employees/menu.jsp");
    }

    public void swapPositionByArchive(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        positions currentPosition = positionsLocalServiceUtil.
                getpositions(Long.parseLong(request.getParameter("currentPositionID")));

        currentPosition.setArchive_status(!request.getParameter("currentPositionFlag").equals("true"));

        positionsLocalServiceUtil.updatepositions(currentPosition);
        response.setRenderParameter("jspPage", "/html/positions/menu.jsp");
    }
}
