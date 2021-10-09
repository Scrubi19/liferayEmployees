package ru.bulatov.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.bulatov.liferay.service.ClpSerializer;
import ru.bulatov.liferay.service.banksLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class banksClp extends BaseModelImpl<banks> implements banks {
    private long _bank_id;
    private String _bank_name;
    private String _bik;
    private String _bank_address;
    private BaseModel<?> _banksRemoteModel;
    private Class<?> _clpSerializerClass = ru.bulatov.liferay.service.ClpSerializer.class;

    public banksClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return banks.class;
    }

    @Override
    public String getModelClassName() {
        return banks.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _bank_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBank_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _bank_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bank_id", getBank_id());
        attributes.put("bank_name", getBank_name());
        attributes.put("bik", getBik());
        attributes.put("bank_address", getBank_address());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bank_id = (Long) attributes.get("bank_id");

        if (bank_id != null) {
            setBank_id(bank_id);
        }

        String bank_name = (String) attributes.get("bank_name");

        if (bank_name != null) {
            setBank_name(bank_name);
        }

        String bik = (String) attributes.get("bik");

        if (bik != null) {
            setBik(bik);
        }

        String bank_address = (String) attributes.get("bank_address");

        if (bank_address != null) {
            setBank_address(bank_address);
        }
    }

    @Override
    public long getBank_id() {
        return _bank_id;
    }

    @Override
    public void setBank_id(long bank_id) {
        _bank_id = bank_id;

        if (_banksRemoteModel != null) {
            try {
                Class<?> clazz = _banksRemoteModel.getClass();

                Method method = clazz.getMethod("setBank_id", long.class);

                method.invoke(_banksRemoteModel, bank_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBank_name() {
        return _bank_name;
    }

    @Override
    public void setBank_name(String bank_name) {
        _bank_name = bank_name;

        if (_banksRemoteModel != null) {
            try {
                Class<?> clazz = _banksRemoteModel.getClass();

                Method method = clazz.getMethod("setBank_name", String.class);

                method.invoke(_banksRemoteModel, bank_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBik() {
        return _bik;
    }

    @Override
    public void setBik(String bik) {
        _bik = bik;

        if (_banksRemoteModel != null) {
            try {
                Class<?> clazz = _banksRemoteModel.getClass();

                Method method = clazz.getMethod("setBik", String.class);

                method.invoke(_banksRemoteModel, bik);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBank_address() {
        return _bank_address;
    }

    @Override
    public void setBank_address(String bank_address) {
        _bank_address = bank_address;

        if (_banksRemoteModel != null) {
            try {
                Class<?> clazz = _banksRemoteModel.getClass();

                Method method = clazz.getMethod("setBank_address", String.class);

                method.invoke(_banksRemoteModel, bank_address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getbanksRemoteModel() {
        return _banksRemoteModel;
    }

    public void setbanksRemoteModel(BaseModel<?> banksRemoteModel) {
        _banksRemoteModel = banksRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _banksRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_banksRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            banksLocalServiceUtil.addbanks(this);
        } else {
            banksLocalServiceUtil.updatebanks(this);
        }
    }

    @Override
    public banks toEscapedModel() {
        return (banks) ProxyUtil.newProxyInstance(banks.class.getClassLoader(),
            new Class[] { banks.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        banksClp clone = new banksClp();

        clone.setBank_id(getBank_id());
        clone.setBank_name(getBank_name());
        clone.setBik(getBik());
        clone.setBank_address(getBank_address());

        return clone;
    }

    @Override
    public int compareTo(banks banks) {
        long primaryKey = banks.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof banksClp)) {
            return false;
        }

        banksClp banks = (banksClp) obj;

        long primaryKey = banks.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{bank_id=");
        sb.append(getBank_id());
        sb.append(", bank_name=");
        sb.append(getBank_name());
        sb.append(", bik=");
        sb.append(getBik());
        sb.append(", bank_address=");
        sb.append(getBank_address());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("ru.bulatov.liferay.model.banks");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bank_id</column-name><column-value><![CDATA[");
        sb.append(getBank_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bank_name</column-name><column-value><![CDATA[");
        sb.append(getBank_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bik</column-name><column-value><![CDATA[");
        sb.append(getBik());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bank_address</column-name><column-value><![CDATA[");
        sb.append(getBank_address());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
