package ru.bulatov.liferay.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class employeesSoap implements Serializable {
    private long _employee_id;
    private String _lastname;
    private String _firstname;
    private String _middlename;
    private String _gender;
    private String _date_of_birth;
    private String _date_of_employment;
    private long _position_id;
    private long _salary;
    private String _work_phonenumber;
    private String _mobile_phonenumber;
    private long _bank_id;
    private boolean _archive_status;

    public employeesSoap() {
    }

    public static employeesSoap toSoapModel(employees model) {
        employeesSoap soapModel = new employeesSoap();

        soapModel.setEmployee_id(model.getEmployee_id());
        soapModel.setLastname(model.getLastname());
        soapModel.setFirstname(model.getFirstname());
        soapModel.setMiddlename(model.getMiddlename());
        soapModel.setGender(model.getGender());
        soapModel.setDate_of_birth(model.getDate_of_birth());
        soapModel.setDate_of_employment(model.getDate_of_employment());
        soapModel.setPosition_id(model.getPosition_id());
        soapModel.setSalary(model.getSalary());
        soapModel.setWork_phonenumber(model.getWork_phonenumber());
        soapModel.setMobile_phonenumber(model.getMobile_phonenumber());
        soapModel.setBank_id(model.getBank_id());
        soapModel.setArchive_status(model.getArchive_status());

        return soapModel;
    }

    public static employeesSoap[] toSoapModels(employees[] models) {
        employeesSoap[] soapModels = new employeesSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static employeesSoap[][] toSoapModels(employees[][] models) {
        employeesSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new employeesSoap[models.length][models[0].length];
        } else {
            soapModels = new employeesSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static employeesSoap[] toSoapModels(List<employees> models) {
        List<employeesSoap> soapModels = new ArrayList<employeesSoap>(models.size());

        for (employees model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new employeesSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employee_id;
    }

    public void setPrimaryKey(long pk) {
        setEmployee_id(pk);
    }

    public long getEmployee_id() {
        return _employee_id;
    }

    public void setEmployee_id(long employee_id) {
        _employee_id = employee_id;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String lastname) {
        _lastname = lastname;
    }

    public String getFirstname() {
        return _firstname;
    }

    public void setFirstname(String firstname) {
        _firstname = firstname;
    }

    public String getMiddlename() {
        return _middlename;
    }

    public void setMiddlename(String middlename) {
        _middlename = middlename;
    }

    public String getGender() {
        return _gender;
    }

    public void setGender(String gender) {
        _gender = gender;
    }

    public String getDate_of_birth() {
        return _date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        _date_of_birth = date_of_birth;
    }

    public String getDate_of_employment() {
        return _date_of_employment;
    }

    public void setDate_of_employment(String date_of_employment) {
        _date_of_employment = date_of_employment;
    }

    public long getPosition_id() {
        return _position_id;
    }

    public void setPosition_id(long position_id) {
        _position_id = position_id;
    }

    public long getSalary() {
        return _salary;
    }

    public void setSalary(long salary) {
        _salary = salary;
    }

    public String getWork_phonenumber() {
        return _work_phonenumber;
    }

    public void setWork_phonenumber(String work_phonenumber) {
        _work_phonenumber = work_phonenumber;
    }

    public String getMobile_phonenumber() {
        return _mobile_phonenumber;
    }

    public void setMobile_phonenumber(String mobile_phonenumber) {
        _mobile_phonenumber = mobile_phonenumber;
    }

    public long getBank_id() {
        return _bank_id;
    }

    public void setBank_id(long bank_id) {
        _bank_id = bank_id;
    }

    public boolean getArchive_status() {
        return _archive_status;
    }

    public boolean isArchive_status() {
        return _archive_status;
    }

    public void setArchive_status(boolean archive_status) {
        _archive_status = archive_status;
    }
}
