package ru.bulatov.liferay.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link positions}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see positions
 * @generated
 */
public class positionsWrapper implements positions, ModelWrapper<positions> {
    private positions _positions;

    public positionsWrapper(positions positions) {
        _positions = positions;
    }

    @Override
    public Class<?> getModelClass() {
        return positions.class;
    }

    @Override
    public String getModelClassName() {
        return positions.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("position_id", getPosition_id());
        attributes.put("position_name", getPosition_name());
        attributes.put("archive_status", getArchive_status());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long position_id = (Long) attributes.get("position_id");

        if (position_id != null) {
            setPosition_id(position_id);
        }

        String position_name = (String) attributes.get("position_name");

        if (position_name != null) {
            setPosition_name(position_name);
        }

        Boolean archive_status = (Boolean) attributes.get("archive_status");

        if (archive_status != null) {
            setArchive_status(archive_status);
        }
    }

    /**
    * Returns the primary key of this positions.
    *
    * @return the primary key of this positions
    */
    @Override
    public long getPrimaryKey() {
        return _positions.getPrimaryKey();
    }

    /**
    * Sets the primary key of this positions.
    *
    * @param primaryKey the primary key of this positions
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _positions.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the position_id of this positions.
    *
    * @return the position_id of this positions
    */
    @Override
    public long getPosition_id() {
        return _positions.getPosition_id();
    }

    /**
    * Sets the position_id of this positions.
    *
    * @param position_id the position_id of this positions
    */
    @Override
    public void setPosition_id(long position_id) {
        _positions.setPosition_id(position_id);
    }

    /**
    * Returns the position_name of this positions.
    *
    * @return the position_name of this positions
    */
    @Override
    public java.lang.String getPosition_name() {
        return _positions.getPosition_name();
    }

    /**
    * Sets the position_name of this positions.
    *
    * @param position_name the position_name of this positions
    */
    @Override
    public void setPosition_name(java.lang.String position_name) {
        _positions.setPosition_name(position_name);
    }

    /**
    * Returns the archive_status of this positions.
    *
    * @return the archive_status of this positions
    */
    @Override
    public boolean getArchive_status() {
        return _positions.getArchive_status();
    }

    /**
    * Returns <code>true</code> if this positions is archive_status.
    *
    * @return <code>true</code> if this positions is archive_status; <code>false</code> otherwise
    */
    @Override
    public boolean isArchive_status() {
        return _positions.isArchive_status();
    }

    /**
    * Sets whether this positions is archive_status.
    *
    * @param archive_status the archive_status of this positions
    */
    @Override
    public void setArchive_status(boolean archive_status) {
        _positions.setArchive_status(archive_status);
    }

    @Override
    public boolean isNew() {
        return _positions.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _positions.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _positions.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _positions.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _positions.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _positions.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _positions.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _positions.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _positions.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _positions.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _positions.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new positionsWrapper((positions) _positions.clone());
    }

    @Override
    public int compareTo(ru.bulatov.liferay.model.positions positions) {
        return _positions.compareTo(positions);
    }

    @Override
    public int hashCode() {
        return _positions.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.bulatov.liferay.model.positions> toCacheModel() {
        return _positions.toCacheModel();
    }

    @Override
    public ru.bulatov.liferay.model.positions toEscapedModel() {
        return new positionsWrapper(_positions.toEscapedModel());
    }

    @Override
    public ru.bulatov.liferay.model.positions toUnescapedModel() {
        return new positionsWrapper(_positions.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _positions.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _positions.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _positions.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof positionsWrapper)) {
            return false;
        }

        positionsWrapper positionsWrapper = (positionsWrapper) obj;

        if (Validator.equals(_positions, positionsWrapper._positions)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public positions getWrappedpositions() {
        return _positions;
    }

    @Override
    public positions getWrappedModel() {
        return _positions;
    }

    @Override
    public void resetOriginalValues() {
        _positions.resetOriginalValues();
    }
}
