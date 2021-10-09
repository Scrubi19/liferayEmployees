package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.bulatov.liferay.model.banks;

import java.util.List;

/**
 * The persistence utility for the banks service. This utility wraps {@link banksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banksPersistence
 * @see banksPersistenceImpl
 * @generated
 */
public class banksUtil {
    private static banksPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(banks banks) {
        getPersistence().clearCache(banks);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<banks> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<banks> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<banks> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static banks update(banks banks) throws SystemException {
        return getPersistence().update(banks);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static banks update(banks banks, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(banks, serviceContext);
    }

    /**
    * Caches the banks in the entity cache if it is enabled.
    *
    * @param banks the banks
    */
    public static void cacheResult(ru.bulatov.liferay.model.banks banks) {
        getPersistence().cacheResult(banks);
    }

    /**
    * Caches the bankses in the entity cache if it is enabled.
    *
    * @param bankses the bankses
    */
    public static void cacheResult(
        java.util.List<ru.bulatov.liferay.model.banks> bankses) {
        getPersistence().cacheResult(bankses);
    }

    /**
    * Creates a new banks with the primary key. Does not add the banks to the database.
    *
    * @param bank_id the primary key for the new banks
    * @return the new banks
    */
    public static ru.bulatov.liferay.model.banks create(long bank_id) {
        return getPersistence().create(bank_id);
    }

    /**
    * Removes the banks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bank_id the primary key of the banks
    * @return the banks that was removed
    * @throws ru.bulatov.liferay.NoSuchbanksException if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.banks remove(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchbanksException {
        return getPersistence().remove(bank_id);
    }

    public static ru.bulatov.liferay.model.banks updateImpl(
        ru.bulatov.liferay.model.banks banks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(banks);
    }

    /**
    * Returns the banks with the primary key or throws a {@link ru.bulatov.liferay.NoSuchbanksException} if it could not be found.
    *
    * @param bank_id the primary key of the banks
    * @return the banks
    * @throws ru.bulatov.liferay.NoSuchbanksException if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.banks findByPrimaryKey(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchbanksException {
        return getPersistence().findByPrimaryKey(bank_id);
    }

    /**
    * Returns the banks with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bank_id the primary key of the banks
    * @return the banks, or <code>null</code> if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.banks fetchByPrimaryKey(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(bank_id);
    }

    /**
    * Returns all the bankses.
    *
    * @return the bankses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.banks> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the bankses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.banksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bankses
    * @param end the upper bound of the range of bankses (not inclusive)
    * @return the range of bankses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.banks> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the bankses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.banksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bankses
    * @param end the upper bound of the range of bankses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of bankses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.banks> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the bankses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of bankses.
    *
    * @return the number of bankses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static banksPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (banksPersistence) PortletBeanLocatorUtil.locate(ru.bulatov.liferay.service.ClpSerializer.getServletContextName(),
                    banksPersistence.class.getName());

            ReferenceRegistry.registerReference(banksUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(banksPersistence persistence) {
    }
}
