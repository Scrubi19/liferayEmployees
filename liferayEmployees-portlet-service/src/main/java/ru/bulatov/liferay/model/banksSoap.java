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
public class banksSoap implements Serializable {
    private long _bank_id;
    private String _bank_name;
    private String _bik;
    private String _bank_address;

    public banksSoap() {
    }

    public static banksSoap toSoapModel(banks model) {
        banksSoap soapModel = new banksSoap();

        soapModel.setBank_id(model.getBank_id());
        soapModel.setBank_name(model.getBank_name());
        soapModel.setBik(model.getBik());
        soapModel.setBank_address(model.getBank_address());

        return soapModel;
    }

    public static banksSoap[] toSoapModels(banks[] models) {
        banksSoap[] soapModels = new banksSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static banksSoap[][] toSoapModels(banks[][] models) {
        banksSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new banksSoap[models.length][models[0].length];
        } else {
            soapModels = new banksSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static banksSoap[] toSoapModels(List<banks> models) {
        List<banksSoap> soapModels = new ArrayList<banksSoap>(models.size());

        for (banks model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new banksSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _bank_id;
    }

    public void setPrimaryKey(long pk) {
        setBank_id(pk);
    }

    public long getBank_id() {
        return _bank_id;
    }

    public void setBank_id(long bank_id) {
        _bank_id = bank_id;
    }

    public String getBank_name() {
        return _bank_name;
    }

    public void setBank_name(String bank_name) {
        _bank_name = bank_name;
    }

    public String getBik() {
        return _bik;
    }

    public void setBik(String bik) {
        _bik = bik;
    }

    public String getBank_address() {
        return _bank_address;
    }

    public void setBank_address(String bank_address) {
        _bank_address = bank_address;
    }
}
