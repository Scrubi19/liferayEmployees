package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.bulatov.liferay.model.positions;
import ru.bulatov.liferay.service.positionsLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class positionsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public positionsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(positionsLocalServiceUtil.getService());
        setClass(positions.class);

        setClassLoader(ru.bulatov.liferay.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("position_id");
    }
}
