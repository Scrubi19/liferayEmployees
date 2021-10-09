package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.bulatov.liferay.model.banks;

/**
 * The persistence interface for the banks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banksPersistenceImpl
 * @see banksUtil
 * @generated
 */
public interface banksPersistence extends BasePersistence<banks> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link banksUtil} to access the banks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the banks in the entity cache if it is enabled.
    *
    * @param banks the banks
    */
    public void cacheResult(ru.bulatov.liferay.model.banks banks);

    /**
    * Caches the bankses in the entity cache if it is enabled.
    *
    * @param bankses the bankses
    */
    public void cacheResult(
        java.util.List<ru.bulatov.liferay.model.banks> bankses);

    /**
    * Creates a new banks with the primary key. Does not add the banks to the database.
    *
    * @param bank_id the primary key for the new banks
    * @return the new banks
    */
    public ru.bulatov.liferay.model.banks create(long bank_id);

    /**
    * Removes the banks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bank_id the primary key of the banks
    * @return the banks that was removed
    * @throws ru.bulatov.liferay.NoSuchbanksException if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.banks remove(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchbanksException;

    public ru.bulatov.liferay.model.banks updateImpl(
        ru.bulatov.liferay.model.banks banks)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the banks with the primary key or throws a {@link ru.bulatov.liferay.NoSuchbanksException} if it could not be found.
    *
    * @param bank_id the primary key of the banks
    * @return the banks
    * @throws ru.bulatov.liferay.NoSuchbanksException if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.banks findByPrimaryKey(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchbanksException;

    /**
    * Returns the banks with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bank_id the primary key of the banks
    * @return the banks, or <code>null</code> if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.banks fetchByPrimaryKey(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bankses.
    *
    * @return the bankses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.banks> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.banks> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.banks> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the bankses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bankses.
    *
    * @return the number of bankses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
