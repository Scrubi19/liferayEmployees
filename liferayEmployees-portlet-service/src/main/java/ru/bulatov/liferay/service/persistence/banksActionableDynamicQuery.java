package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.bulatov.liferay.model.banks;
import ru.bulatov.liferay.service.banksLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class banksActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public banksActionableDynamicQuery() throws SystemException {
        setBaseLocalService(banksLocalServiceUtil.getService());
        setClass(banks.class);

        setClassLoader(ru.bulatov.liferay.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bank_id");
    }
}
