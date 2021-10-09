package ru.bulatov.liferay.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.bulatov.liferay.model.positions;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing positions in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see positions
 * @generated
 */
public class positionsCacheModel implements CacheModel<positions>,
    Externalizable {
    public long position_id;
    public String position_name;
    public boolean archive_status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{position_id=");
        sb.append(position_id);
        sb.append(", position_name=");
        sb.append(position_name);
        sb.append(", archive_status=");
        sb.append(archive_status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public positions toEntityModel() {
        positionsImpl positionsImpl = new positionsImpl();

        positionsImpl.setPosition_id(position_id);

        if (position_name == null) {
            positionsImpl.setPosition_name(StringPool.BLANK);
        } else {
            positionsImpl.setPosition_name(position_name);
        }

        positionsImpl.setArchive_status(archive_status);

        positionsImpl.resetOriginalValues();

        return positionsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        position_id = objectInput.readLong();
        position_name = objectInput.readUTF();
        archive_status = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(position_id);

        if (position_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(position_name);
        }

        objectOutput.writeBoolean(archive_status);
    }
}
