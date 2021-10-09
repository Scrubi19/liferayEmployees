package ru.bulatov.liferay.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.bulatov.liferay.model.banks;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing banks in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see banks
 * @generated
 */
public class banksCacheModel implements CacheModel<banks>, Externalizable {
    public long bank_id;
    public String bank_name;
    public String bik;
    public String bank_address;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{bank_id=");
        sb.append(bank_id);
        sb.append(", bank_name=");
        sb.append(bank_name);
        sb.append(", bik=");
        sb.append(bik);
        sb.append(", bank_address=");
        sb.append(bank_address);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public banks toEntityModel() {
        banksImpl banksImpl = new banksImpl();

        banksImpl.setBank_id(bank_id);

        if (bank_name == null) {
            banksImpl.setBank_name(StringPool.BLANK);
        } else {
            banksImpl.setBank_name(bank_name);
        }

        if (bik == null) {
            banksImpl.setBik(StringPool.BLANK);
        } else {
            banksImpl.setBik(bik);
        }

        if (bank_address == null) {
            banksImpl.setBank_address(StringPool.BLANK);
        } else {
            banksImpl.setBank_address(bank_address);
        }

        banksImpl.resetOriginalValues();

        return banksImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        bank_id = objectInput.readLong();
        bank_name = objectInput.readUTF();
        bik = objectInput.readUTF();
        bank_address = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(bank_id);

        if (bank_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bank_name);
        }

        if (bik == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bik);
        }

        if (bank_address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bank_address);
        }
    }
}
