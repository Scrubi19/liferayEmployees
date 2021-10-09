package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.bulatov.liferay.NoSuchbanksException;
import ru.bulatov.liferay.model.banks;
import ru.bulatov.liferay.model.impl.banksImpl;
import ru.bulatov.liferay.model.impl.banksModelImpl;
import ru.bulatov.liferay.service.persistence.banksPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the banks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banksPersistence
 * @see banksUtil
 * @generated
 */
public class banksPersistenceImpl extends BasePersistenceImpl<banks>
    implements banksPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link banksUtil} to access the banks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = banksImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(banksModelImpl.ENTITY_CACHE_ENABLED,
            banksModelImpl.FINDER_CACHE_ENABLED, banksImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(banksModelImpl.ENTITY_CACHE_ENABLED,
            banksModelImpl.FINDER_CACHE_ENABLED, banksImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(banksModelImpl.ENTITY_CACHE_ENABLED,
            banksModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_BANKS = "SELECT banks FROM banks banks";
    private static final String _SQL_COUNT_BANKS = "SELECT COUNT(banks) FROM banks banks";
    private static final String _ORDER_BY_ENTITY_ALIAS = "banks.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No banks exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(banksPersistenceImpl.class);
    private static banks _nullbanks = new banksImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<banks> toCacheModel() {
                return _nullbanksCacheModel;
            }
        };

    private static CacheModel<banks> _nullbanksCacheModel = new CacheModel<banks>() {
            @Override
            public banks toEntityModel() {
                return _nullbanks;
            }
        };

    public banksPersistenceImpl() {
        setModelClass(banks.class);
    }

    /**
     * Caches the banks in the entity cache if it is enabled.
     *
     * @param banks the banks
     */
    @Override
    public void cacheResult(banks banks) {
        EntityCacheUtil.putResult(banksModelImpl.ENTITY_CACHE_ENABLED,
            banksImpl.class, banks.getPrimaryKey(), banks);

        banks.resetOriginalValues();
    }

    /**
     * Caches the bankses in the entity cache if it is enabled.
     *
     * @param bankses the bankses
     */
    @Override
    public void cacheResult(List<banks> bankses) {
        for (banks banks : bankses) {
            if (EntityCacheUtil.getResult(banksModelImpl.ENTITY_CACHE_ENABLED,
                        banksImpl.class, banks.getPrimaryKey()) == null) {
                cacheResult(banks);
            } else {
                banks.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all bankses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(banksImpl.class.getName());
        }

        EntityCacheUtil.clearCache(banksImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the banks.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(banks banks) {
        EntityCacheUtil.removeResult(banksModelImpl.ENTITY_CACHE_ENABLED,
            banksImpl.class, banks.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<banks> bankses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (banks banks : bankses) {
            EntityCacheUtil.removeResult(banksModelImpl.ENTITY_CACHE_ENABLED,
                banksImpl.class, banks.getPrimaryKey());
        }
    }

    /**
     * Creates a new banks with the primary key. Does not add the banks to the database.
     *
     * @param bank_id the primary key for the new banks
     * @return the new banks
     */
    @Override
    public banks create(long bank_id) {
        banks banks = new banksImpl();

        banks.setNew(true);
        banks.setPrimaryKey(bank_id);

        return banks;
    }

    /**
     * Removes the banks with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param bank_id the primary key of the banks
     * @return the banks that was removed
     * @throws ru.bulatov.liferay.NoSuchbanksException if a banks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public banks remove(long bank_id)
        throws NoSuchbanksException, SystemException {
        return remove((Serializable) bank_id);
    }

    /**
     * Removes the banks with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the banks
     * @return the banks that was removed
     * @throws ru.bulatov.liferay.NoSuchbanksException if a banks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public banks remove(Serializable primaryKey)
        throws NoSuchbanksException, SystemException {
        Session session = null;

        try {
            session = openSession();

            banks banks = (banks) session.get(banksImpl.class, primaryKey);

            if (banks == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchbanksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(banks);
        } catch (NoSuchbanksException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected banks removeImpl(banks banks) throws SystemException {
        banks = toUnwrappedModel(banks);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(banks)) {
                banks = (banks) session.get(banksImpl.class,
                        banks.getPrimaryKeyObj());
            }

            if (banks != null) {
                session.delete(banks);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (banks != null) {
            clearCache(banks);
        }

        return banks;
    }

    @Override
    public banks updateImpl(ru.bulatov.liferay.model.banks banks)
        throws SystemException {
        banks = toUnwrappedModel(banks);

        boolean isNew = banks.isNew();

        Session session = null;

        try {
            session = openSession();

            if (banks.isNew()) {
                session.save(banks);

                banks.setNew(false);
            } else {
                session.merge(banks);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(banksModelImpl.ENTITY_CACHE_ENABLED,
            banksImpl.class, banks.getPrimaryKey(), banks);

        return banks;
    }

    protected banks toUnwrappedModel(banks banks) {
        if (banks instanceof banksImpl) {
            return banks;
        }

        banksImpl banksImpl = new banksImpl();

        banksImpl.setNew(banks.isNew());
        banksImpl.setPrimaryKey(banks.getPrimaryKey());

        banksImpl.setBank_id(banks.getBank_id());
        banksImpl.setBank_name(banks.getBank_name());
        banksImpl.setBik(banks.getBik());
        banksImpl.setBank_address(banks.getBank_address());

        return banksImpl;
    }

    /**
     * Returns the banks with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the banks
     * @return the banks
     * @throws ru.bulatov.liferay.NoSuchbanksException if a banks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public banks findByPrimaryKey(Serializable primaryKey)
        throws NoSuchbanksException, SystemException {
        banks banks = fetchByPrimaryKey(primaryKey);

        if (banks == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchbanksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return banks;
    }

    /**
     * Returns the banks with the primary key or throws a {@link ru.bulatov.liferay.NoSuchbanksException} if it could not be found.
     *
     * @param bank_id the primary key of the banks
     * @return the banks
     * @throws ru.bulatov.liferay.NoSuchbanksException if a banks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public banks findByPrimaryKey(long bank_id)
        throws NoSuchbanksException, SystemException {
        return findByPrimaryKey((Serializable) bank_id);
    }

    /**
     * Returns the banks with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the banks
     * @return the banks, or <code>null</code> if a banks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public banks fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        banks banks = (banks) EntityCacheUtil.getResult(banksModelImpl.ENTITY_CACHE_ENABLED,
                banksImpl.class, primaryKey);

        if (banks == _nullbanks) {
            return null;
        }

        if (banks == null) {
            Session session = null;

            try {
                session = openSession();

                banks = (banks) session.get(banksImpl.class, primaryKey);

                if (banks != null) {
                    cacheResult(banks);
                } else {
                    EntityCacheUtil.putResult(banksModelImpl.ENTITY_CACHE_ENABLED,
                        banksImpl.class, primaryKey, _nullbanks);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(banksModelImpl.ENTITY_CACHE_ENABLED,
                    banksImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return banks;
    }

    /**
     * Returns the banks with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param bank_id the primary key of the banks
     * @return the banks, or <code>null</code> if a banks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public banks fetchByPrimaryKey(long bank_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) bank_id);
    }

    /**
     * Returns all the bankses.
     *
     * @return the bankses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<banks> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<banks> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<banks> findAll(int start, int end,
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

        List<banks> list = (List<banks>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BANKS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BANKS;

                if (pagination) {
                    sql = sql.concat(banksModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<banks>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<banks>(list);
                } else {
                    list = (List<banks>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the bankses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (banks banks : findAll()) {
            remove(banks);
        }
    }

    /**
     * Returns the number of bankses.
     *
     * @return the number of bankses
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

                Query q = session.createQuery(_SQL_COUNT_BANKS);

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
     * Initializes the banks persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.bulatov.liferay.model.banks")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<banks>> listenersList = new ArrayList<ModelListener<banks>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<banks>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(banksImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
