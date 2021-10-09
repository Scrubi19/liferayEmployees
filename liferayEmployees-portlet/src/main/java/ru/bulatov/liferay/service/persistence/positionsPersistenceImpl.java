package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.bulatov.liferay.NoSuchpositionsException;
import ru.bulatov.liferay.model.impl.positionsImpl;
import ru.bulatov.liferay.model.impl.positionsModelImpl;
import ru.bulatov.liferay.model.positions;
import ru.bulatov.liferay.service.persistence.positionsPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the positions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see positionsPersistence
 * @see positionsUtil
 * @generated
 */
public class positionsPersistenceImpl extends BasePersistenceImpl<positions>
    implements positionsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link positionsUtil} to access the positions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = positionsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(positionsModelImpl.ENTITY_CACHE_ENABLED,
            positionsModelImpl.FINDER_CACHE_ENABLED, positionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(positionsModelImpl.ENTITY_CACHE_ENABLED,
            positionsModelImpl.FINDER_CACHE_ENABLED, positionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(positionsModelImpl.ENTITY_CACHE_ENABLED,
            positionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVE = new FinderPath(positionsModelImpl.ENTITY_CACHE_ENABLED,
            positionsModelImpl.FINDER_CACHE_ENABLED, positionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArchive",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE =
        new FinderPath(positionsModelImpl.ENTITY_CACHE_ENABLED,
            positionsModelImpl.FINDER_CACHE_ENABLED, positionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArchive",
            new String[] { Boolean.class.getName() },
            positionsModelImpl.ARCHIVE_STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ARCHIVE = new FinderPath(positionsModelImpl.ENTITY_CACHE_ENABLED,
            positionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArchive",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ARCHIVE_ARCHIVE_STATUS_2 = "positions.archive_status = ?";
    private static final String _SQL_SELECT_POSITIONS = "SELECT positions FROM positions positions";
    private static final String _SQL_SELECT_POSITIONS_WHERE = "SELECT positions FROM positions positions WHERE ";
    private static final String _SQL_COUNT_POSITIONS = "SELECT COUNT(positions) FROM positions positions";
    private static final String _SQL_COUNT_POSITIONS_WHERE = "SELECT COUNT(positions) FROM positions positions WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "positions.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No positions exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No positions exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(positionsPersistenceImpl.class);
    private static positions _nullpositions = new positionsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<positions> toCacheModel() {
                return _nullpositionsCacheModel;
            }
        };

    private static CacheModel<positions> _nullpositionsCacheModel = new CacheModel<positions>() {
            @Override
            public positions toEntityModel() {
                return _nullpositions;
            }
        };

    public positionsPersistenceImpl() {
        setModelClass(positions.class);
    }

    /**
     * Returns all the positionses where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @return the matching positionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<positions> findByArchive(boolean archive_status)
        throws SystemException {
        return findByArchive(archive_status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<positions> findByArchive(boolean archive_status, int start,
        int end) throws SystemException {
        return findByArchive(archive_status, start, end, null);
    }

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
    @Override
    public List<positions> findByArchive(boolean archive_status, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE;
            finderArgs = new Object[] { archive_status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVE;
            finderArgs = new Object[] {
                    archive_status,
                    
                    start, end, orderByComparator
                };
        }

        List<positions> list = (List<positions>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (positions positions : list) {
                if ((archive_status != positions.getArchive_status())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_POSITIONS_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVE_ARCHIVE_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(positionsModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive_status);

                if (!pagination) {
                    list = (List<positions>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<positions>(list);
                } else {
                    list = (List<positions>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first positions in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching positions
     * @throws ru.bulatov.liferay.NoSuchpositionsException if a matching positions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions findByArchive_First(boolean archive_status,
        OrderByComparator orderByComparator)
        throws NoSuchpositionsException, SystemException {
        positions positions = fetchByArchive_First(archive_status,
                orderByComparator);

        if (positions != null) {
            return positions;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive_status=");
        msg.append(archive_status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchpositionsException(msg.toString());
    }

    /**
     * Returns the first positions in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching positions, or <code>null</code> if a matching positions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions fetchByArchive_First(boolean archive_status,
        OrderByComparator orderByComparator) throws SystemException {
        List<positions> list = findByArchive(archive_status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last positions in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching positions
     * @throws ru.bulatov.liferay.NoSuchpositionsException if a matching positions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions findByArchive_Last(boolean archive_status,
        OrderByComparator orderByComparator)
        throws NoSuchpositionsException, SystemException {
        positions positions = fetchByArchive_Last(archive_status,
                orderByComparator);

        if (positions != null) {
            return positions;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive_status=");
        msg.append(archive_status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchpositionsException(msg.toString());
    }

    /**
     * Returns the last positions in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching positions, or <code>null</code> if a matching positions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions fetchByArchive_Last(boolean archive_status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByArchive(archive_status);

        if (count == 0) {
            return null;
        }

        List<positions> list = findByArchive(archive_status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public positions[] findByArchive_PrevAndNext(long position_id,
        boolean archive_status, OrderByComparator orderByComparator)
        throws NoSuchpositionsException, SystemException {
        positions positions = findByPrimaryKey(position_id);

        Session session = null;

        try {
            session = openSession();

            positions[] array = new positionsImpl[3];

            array[0] = getByArchive_PrevAndNext(session, positions,
                    archive_status, orderByComparator, true);

            array[1] = positions;

            array[2] = getByArchive_PrevAndNext(session, positions,
                    archive_status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected positions getByArchive_PrevAndNext(Session session,
        positions positions, boolean archive_status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_POSITIONS_WHERE);

        query.append(_FINDER_COLUMN_ARCHIVE_ARCHIVE_STATUS_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(positionsModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(archive_status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(positions);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<positions> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the positionses where archive_status = &#63; from the database.
     *
     * @param archive_status the archive_status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByArchive(boolean archive_status)
        throws SystemException {
        for (positions positions : findByArchive(archive_status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(positions);
        }
    }

    /**
     * Returns the number of positionses where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @return the number of matching positionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByArchive(boolean archive_status) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ARCHIVE;

        Object[] finderArgs = new Object[] { archive_status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_POSITIONS_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVE_ARCHIVE_STATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive_status);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the positions in the entity cache if it is enabled.
     *
     * @param positions the positions
     */
    @Override
    public void cacheResult(positions positions) {
        EntityCacheUtil.putResult(positionsModelImpl.ENTITY_CACHE_ENABLED,
            positionsImpl.class, positions.getPrimaryKey(), positions);

        positions.resetOriginalValues();
    }

    /**
     * Caches the positionses in the entity cache if it is enabled.
     *
     * @param positionses the positionses
     */
    @Override
    public void cacheResult(List<positions> positionses) {
        for (positions positions : positionses) {
            if (EntityCacheUtil.getResult(
                        positionsModelImpl.ENTITY_CACHE_ENABLED,
                        positionsImpl.class, positions.getPrimaryKey()) == null) {
                cacheResult(positions);
            } else {
                positions.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all positionses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(positionsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(positionsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the positions.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(positions positions) {
        EntityCacheUtil.removeResult(positionsModelImpl.ENTITY_CACHE_ENABLED,
            positionsImpl.class, positions.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<positions> positionses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (positions positions : positionses) {
            EntityCacheUtil.removeResult(positionsModelImpl.ENTITY_CACHE_ENABLED,
                positionsImpl.class, positions.getPrimaryKey());
        }
    }

    /**
     * Creates a new positions with the primary key. Does not add the positions to the database.
     *
     * @param position_id the primary key for the new positions
     * @return the new positions
     */
    @Override
    public positions create(long position_id) {
        positions positions = new positionsImpl();

        positions.setNew(true);
        positions.setPrimaryKey(position_id);

        return positions;
    }

    /**
     * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param position_id the primary key of the positions
     * @return the positions that was removed
     * @throws ru.bulatov.liferay.NoSuchpositionsException if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions remove(long position_id)
        throws NoSuchpositionsException, SystemException {
        return remove((Serializable) position_id);
    }

    /**
     * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the positions
     * @return the positions that was removed
     * @throws ru.bulatov.liferay.NoSuchpositionsException if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions remove(Serializable primaryKey)
        throws NoSuchpositionsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            positions positions = (positions) session.get(positionsImpl.class,
                    primaryKey);

            if (positions == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchpositionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(positions);
        } catch (NoSuchpositionsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected positions removeImpl(positions positions)
        throws SystemException {
        positions = toUnwrappedModel(positions);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(positions)) {
                positions = (positions) session.get(positionsImpl.class,
                        positions.getPrimaryKeyObj());
            }

            if (positions != null) {
                session.delete(positions);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (positions != null) {
            clearCache(positions);
        }

        return positions;
    }

    @Override
    public positions updateImpl(ru.bulatov.liferay.model.positions positions)
        throws SystemException {
        positions = toUnwrappedModel(positions);

        boolean isNew = positions.isNew();

        positionsModelImpl positionsModelImpl = (positionsModelImpl) positions;

        Session session = null;

        try {
            session = openSession();

            if (positions.isNew()) {
                session.save(positions);

                positions.setNew(false);
            } else {
                session.merge(positions);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !positionsModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((positionsModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        positionsModelImpl.getOriginalArchive_status()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE,
                    args);

                args = new Object[] { positionsModelImpl.getArchive_status() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE,
                    args);
            }
        }

        EntityCacheUtil.putResult(positionsModelImpl.ENTITY_CACHE_ENABLED,
            positionsImpl.class, positions.getPrimaryKey(), positions);

        return positions;
    }

    protected positions toUnwrappedModel(positions positions) {
        if (positions instanceof positionsImpl) {
            return positions;
        }

        positionsImpl positionsImpl = new positionsImpl();

        positionsImpl.setNew(positions.isNew());
        positionsImpl.setPrimaryKey(positions.getPrimaryKey());

        positionsImpl.setPosition_id(positions.getPosition_id());
        positionsImpl.setPosition_name(positions.getPosition_name());
        positionsImpl.setArchive_status(positions.isArchive_status());

        return positionsImpl;
    }

    /**
     * Returns the positions with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the positions
     * @return the positions
     * @throws ru.bulatov.liferay.NoSuchpositionsException if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions findByPrimaryKey(Serializable primaryKey)
        throws NoSuchpositionsException, SystemException {
        positions positions = fetchByPrimaryKey(primaryKey);

        if (positions == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchpositionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return positions;
    }

    /**
     * Returns the positions with the primary key or throws a {@link ru.bulatov.liferay.NoSuchpositionsException} if it could not be found.
     *
     * @param position_id the primary key of the positions
     * @return the positions
     * @throws ru.bulatov.liferay.NoSuchpositionsException if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions findByPrimaryKey(long position_id)
        throws NoSuchpositionsException, SystemException {
        return findByPrimaryKey((Serializable) position_id);
    }

    /**
     * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the positions
     * @return the positions, or <code>null</code> if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        positions positions = (positions) EntityCacheUtil.getResult(positionsModelImpl.ENTITY_CACHE_ENABLED,
                positionsImpl.class, primaryKey);

        if (positions == _nullpositions) {
            return null;
        }

        if (positions == null) {
            Session session = null;

            try {
                session = openSession();

                positions = (positions) session.get(positionsImpl.class,
                        primaryKey);

                if (positions != null) {
                    cacheResult(positions);
                } else {
                    EntityCacheUtil.putResult(positionsModelImpl.ENTITY_CACHE_ENABLED,
                        positionsImpl.class, primaryKey, _nullpositions);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(positionsModelImpl.ENTITY_CACHE_ENABLED,
                    positionsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return positions;
    }

    /**
     * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param position_id the primary key of the positions
     * @return the positions, or <code>null</code> if a positions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public positions fetchByPrimaryKey(long position_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) position_id);
    }

    /**
     * Returns all the positionses.
     *
     * @return the positionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<positions> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<positions> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<positions> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<positions> list = (List<positions>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_POSITIONS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_POSITIONS;

                if (pagination) {
                    sql = sql.concat(positionsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<positions>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<positions>(list);
                } else {
                    list = (List<positions>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the positionses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (positions positions : findAll()) {
            remove(positions);
        }
    }

    /**
     * Returns the number of positionses.
     *
     * @return the number of positionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_POSITIONS);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the positions persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.bulatov.liferay.model.positions")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<positions>> listenersList = new ArrayList<ModelListener<positions>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<positions>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(positionsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
