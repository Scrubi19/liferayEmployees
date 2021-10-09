package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.bulatov.liferay.model.positions;

/**
 * The persistence interface for the positions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see positionsPersistenceImpl
 * @see positionsUtil
 * @generated
 */
public interface positionsPersistence extends BasePersistence<positions> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link positionsUtil} to access the positions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the positionses where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the matching positionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.positions> findByArchive(
        boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the positionses where archive_status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.positionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive_status the archive_status
    * @param start the lower bound of the range of positionses
    * @param end the upper bound of the range of positionses (not inclusive)
    * @return the range of matching positionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.positions> findByArchive(
        boolean archive_status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the positionses where archive_status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.positionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive_status the archive_status
    * @param start the lower bound of the range of positionses
    * @param end the upper bound of the range of positionses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching positionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.positions> findByArchive(
        boolean archive_status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first positions in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching positions
    * @throws ru.bulatov.liferay.NoSuchpositionsException if a matching positions could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.positions findByArchive_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchpositionsException;

    /**
    * Returns the first positions in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching positions, or <code>null</code> if a matching positions could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.positions fetchByArchive_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last positions in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching positions
    * @throws ru.bulatov.liferay.NoSuchpositionsException if a matching positions could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.positions findByArchive_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchpositionsException;

    /**
    * Returns the last positions in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching positions, or <code>null</code> if a matching positions could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.positions fetchByArchive_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the positionses before and after the current positions in the ordered set where archive_status = &#63;.
    *
    * @param position_id the primary key of the current positions
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next positions
    * @throws ru.bulatov.liferay.NoSuchpositionsException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.positions[] findByArchive_PrevAndNext(
        long position_id, boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchpositionsException;

    /**
    * Removes all the positionses where archive_status = &#63; from the database.
    *
    * @param archive_status the archive_status
    * @throws SystemException if a system exception occurred
    */
    public void removeByArchive(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of positionses where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the number of matching positionses
    * @throws SystemException if a system exception occurred
    */
    public int countByArchive(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the positions in the entity cache if it is enabled.
    *
    * @param positions the positions
    */
    public void cacheResult(ru.bulatov.liferay.model.positions positions);

    /**
    * Caches the positionses in the entity cache if it is enabled.
    *
    * @param positionses the positionses
    */
    public void cacheResult(
        java.util.List<ru.bulatov.liferay.model.positions> positionses);

    /**
    * Creates a new positions with the primary key. Does not add the positions to the database.
    *
    * @param position_id the primary key for the new positions
    * @return the new positions
    */
    public ru.bulatov.liferay.model.positions create(long position_id);

    /**
    * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_id the primary key of the positions
    * @return the positions that was removed
    * @throws ru.bulatov.liferay.NoSuchpositionsException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.positions remove(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchpositionsException;

    public ru.bulatov.liferay.model.positions updateImpl(
        ru.bulatov.liferay.model.positions positions)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the positions with the primary key or throws a {@link ru.bulatov.liferay.NoSuchpositionsException} if it could not be found.
    *
    * @param position_id the primary key of the positions
    * @return the positions
    * @throws ru.bulatov.liferay.NoSuchpositionsException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.positions findByPrimaryKey(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchpositionsException;

    /**
    * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param position_id the primary key of the positions
    * @return the positions, or <code>null</code> if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.positions fetchByPrimaryKey(
        long position_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the positionses.
    *
    * @return the positionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.positions> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the positionses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.positionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of positionses
    * @param end the upper bound of the range of positionses (not inclusive)
    * @return the range of positionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.positions> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the positionses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.positionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of positionses
    * @param end the upper bound of the range of positionses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of positionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.positions> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the positionses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of positionses.
    *
    * @return the number of positionses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
