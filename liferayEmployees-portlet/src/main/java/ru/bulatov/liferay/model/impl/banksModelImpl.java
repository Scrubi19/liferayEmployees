package ru.bulatov.liferay.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import ru.bulatov.liferay.model.banks;
import ru.bulatov.liferay.model.banksModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the banks service. Represents a row in the &quot;liferay_banks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ru.bulatov.liferay.model.banksModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link banksImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banksImpl
 * @see ru.bulatov.liferay.model.banks
 * @see ru.bulatov.liferay.model.banksModel
 * @generated
 */
public class banksModelImpl extends BaseModelImpl<banks> implements banksModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a banks model instance should use the {@link ru.bulatov.liferay.model.banks} interface instead.
     */
    public static final String TABLE_NAME = "liferay_banks";
    public static final Object[][] TABLE_COLUMNS = {
            { "bank_id", Types.BIGINT },
            { "bank_name", Types.VARCHAR },
            { "bik", Types.VARCHAR },
            { "bank_address", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table liferay_banks (bank_id LONG not null primary key,bank_name VARCHAR(75) null,bik VARCHAR(75) null,bank_address VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table liferay_banks";
    public static final String ORDER_BY_JPQL = " ORDER BY banks.bank_id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY liferay_banks.bank_id ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.ru.bulatov.liferay.model.banks"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.ru.bulatov.liferay.model.banks"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.ru.bulatov.liferay.model.banks"));
    private static ClassLoader _classLoader = banks.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { banks.class };
    private long _bank_id;
    private String _bank_name;
    private String _bik;
    private String _bank_address;
    private banks _escapedModel;

    public banksModelImpl() {
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
    public Class<?> getModelClass() {
        return banks.class;
    }

    @Override
    public String getModelClassName() {
        return banks.class.getName();
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
    }

    @Override
    public String getBank_name() {
        if (_bank_name == null) {
            return StringPool.BLANK;
        } else {
            return _bank_name;
        }
    }

    @Override
    public void setBank_name(String bank_name) {
        _bank_name = bank_name;
    }

    @Override
    public String getBik() {
        if (_bik == null) {
            return StringPool.BLANK;
        } else {
            return _bik;
        }
    }

    @Override
    public void setBik(String bik) {
        _bik = bik;
    }

    @Override
    public String getBank_address() {
        if (_bank_address == null) {
            return StringPool.BLANK;
        } else {
            return _bank_address;
        }
    }

    @Override
    public void setBank_address(String bank_address) {
        _bank_address = bank_address;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            banks.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public banks toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (banks) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        banksImpl banksImpl = new banksImpl();

        banksImpl.setBank_id(getBank_id());
        banksImpl.setBank_name(getBank_name());
        banksImpl.setBik(getBik());
        banksImpl.setBank_address(getBank_address());

        banksImpl.resetOriginalValues();

        return banksImpl;
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

        if (!(obj instanceof banks)) {
            return false;
        }

        banks banks = (banks) obj;

        long primaryKey = banks.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<banks> toCacheModel() {
        banksCacheModel banksCacheModel = new banksCacheModel();

        banksCacheModel.bank_id = getBank_id();

        banksCacheModel.bank_name = getBank_name();

        String bank_name = banksCacheModel.bank_name;

        if ((bank_name != null) && (bank_name.length() == 0)) {
            banksCacheModel.bank_name = null;
        }

        banksCacheModel.bik = getBik();

        String bik = banksCacheModel.bik;

        if ((bik != null) && (bik.length() == 0)) {
            banksCacheModel.bik = null;
        }

        banksCacheModel.bank_address = getBank_address();

        String bank_address = banksCacheModel.bank_address;

        if ((bank_address != null) && (bank_address.length() == 0)) {
            banksCacheModel.bank_address = null;
        }

        return banksCacheModel;
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
