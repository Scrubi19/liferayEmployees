package ru.bulatov.liferay.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import ru.bulatov.liferay.model.positions;
import ru.bulatov.liferay.service.base.positionsLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the positions local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.bulatov.liferay.service.positionsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.bulatov.liferay.service.base.positionsLocalServiceBaseImpl
 * @see ru.bulatov.liferay.service.positionsLocalServiceUtil
 */
public class positionsLocalServiceImpl extends positionsLocalServiceBaseImpl {
    @Override
    public List<positions> getpositionsesByArchive(boolean archive, int start, int end) throws SystemException {
        return positionsPersistence.findByArchive(archive);

    }
}
