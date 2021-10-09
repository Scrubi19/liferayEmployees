package ru.bulatov.liferay.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link banks}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banks
 * @generated
 */
public class banksWrapper implements banks, ModelWrapper<banks> {
    private banks _banks;

    public banksWrapper(banks banks) {
        _banks = banks;
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

    /**
    * Returns the primary key of this banks.
    *
    * @return the primary key of this banks
    */
    @Override
    public long getPrimaryKey() {
        return _banks.getPrimaryKey();
    }

    /**
    * Sets the primary key of this banks.
    *
    * @param primaryKey the primary key of this banks
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _banks.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the bank_id of this banks.
    *
    * @return the bank_id of this banks
    */
    @Override
    public long getBank_id() {
        return _banks.getBank_id();
    }

    /**
    * Sets the bank_id of this banks.
    *
    * @param bank_id the bank_id of this banks
    */
    @Override
    public void setBank_id(long bank_id) {
        _banks.setBank_id(bank_id);
    }

    /**
    * Returns the bank_name of this banks.
    *
    * @return the bank_name of this banks
    */
    @Override
    public java.lang.String getBank_name() {
        return _banks.getBank_name();
    }

    /**
    * Sets the bank_name of this banks.
    *
    * @param bank_name the bank_name of this banks
    */
    @Override
    public void setBank_name(java.lang.String bank_name) {
        _banks.setBank_name(bank_name);
    }

    /**
    * Returns the bik of this banks.
    *
    * @return the bik of this banks
    */
    @Override
    public java.lang.String getBik() {
        return _banks.getBik();
    }

    /**
    * Sets the bik of this banks.
    *
    * @param bik the bik of this banks
    */
    @Override
    public void setBik(java.lang.String bik) {
        _banks.setBik(bik);
    }

    /**
    * Returns the bank_address of this banks.
    *
    * @return the bank_address of this banks
    */
    @Override
    public java.lang.String getBank_address() {
        return _banks.getBank_address();
    }

    /**
    * Sets the bank_address of this banks.
    *
    * @param bank_address the bank_address of this banks
    */
    @Override
    public void setBank_address(java.lang.String bank_address) {
        _banks.setBank_address(bank_address);
    }

    @Override
    public boolean isNew() {
        return _banks.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _banks.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _banks.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _banks.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _banks.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _banks.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _banks.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _banks.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _banks.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _banks.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _banks.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new banksWrapper((banks) _banks.clone());
    }

    @Override
    public int compareTo(ru.bulatov.liferay.model.banks banks) {
        return _banks.compareTo(banks);
    }

    @Override
    public int hashCode() {
        return _banks.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.bulatov.liferay.model.banks> toCacheModel() {
        return _banks.toCacheModel();
    }

    @Override
    public ru.bulatov.liferay.model.banks toEscapedModel() {
        return new banksWrapper(_banks.toEscapedModel());
    }

    @Override
    public ru.bulatov.liferay.model.banks toUnescapedModel() {
        return new banksWrapper(_banks.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _banks.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _banks.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _banks.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof banksWrapper)) {
            return false;
        }

        banksWrapper banksWrapper = (banksWrapper) obj;

        if (Validator.equals(_banks, banksWrapper._banks)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public banks getWrappedbanks() {
        return _banks;
    }

    @Override
    public banks getWrappedModel() {
        return _banks;
    }

    @Override
    public void resetOriginalValues() {
        _banks.resetOriginalValues();
    }
}
