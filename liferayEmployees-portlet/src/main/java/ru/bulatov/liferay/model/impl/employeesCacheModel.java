package ru.bulatov.liferay.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.bulatov.liferay.model.employees;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing employees in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see employees
 * @generated
 */
public class employeesCacheModel implements CacheModel<employees>,
    Externalizable {
    public long employee_id;
    public String lastname;
    public String firstname;
    public String middlename;
    public String gender;
    public String date_of_birth;
    public String date_of_employment;
    public long position_id;
    public long salary;
    public String work_phonenumber;
    public String mobile_phonenumber;
    public long bank_id;
    public boolean archive_status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{employee_id=");
        sb.append(employee_id);
        sb.append(", lastname=");
        sb.append(lastname);
        sb.append(", firstname=");
        sb.append(firstname);
        sb.append(", middlename=");
        sb.append(middlename);
        sb.append(", gender=");
        sb.append(gender);
        sb.append(", date_of_birth=");
        sb.append(date_of_birth);
        sb.append(", date_of_employment=");
        sb.append(date_of_employment);
        sb.append(", position_id=");
        sb.append(position_id);
        sb.append(", salary=");
        sb.append(salary);
        sb.append(", work_phonenumber=");
        sb.append(work_phonenumber);
        sb.append(", mobile_phonenumber=");
        sb.append(mobile_phonenumber);
        sb.append(", bank_id=");
        sb.append(bank_id);
        sb.append(", archive_status=");
        sb.append(archive_status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public employees toEntityModel() {
        employeesImpl employeesImpl = new employeesImpl();

        employeesImpl.setEmployee_id(employee_id);

        if (lastname == null) {
            employeesImpl.setLastname(StringPool.BLANK);
        } else {
            employeesImpl.setLastname(lastname);
        }

        if (firstname == null) {
            employeesImpl.setFirstname(StringPool.BLANK);
        } else {
            employeesImpl.setFirstname(firstname);
        }

        if (middlename == null) {
            employeesImpl.setMiddlename(StringPool.BLANK);
        } else {
            employeesImpl.setMiddlename(middlename);
        }

        if (gender == null) {
            employeesImpl.setGender(StringPool.BLANK);
        } else {
            employeesImpl.setGender(gender);
        }

        if (date_of_birth == null) {
            employeesImpl.setDate_of_birth(StringPool.BLANK);
        } else {
            employeesImpl.setDate_of_birth(date_of_birth);
        }

        if (date_of_employment == null) {
            employeesImpl.setDate_of_employment(StringPool.BLANK);
        } else {
            employeesImpl.setDate_of_employment(date_of_employment);
        }

        employeesImpl.setPosition_id(position_id);
        employeesImpl.setSalary(salary);

        if (work_phonenumber == null) {
            employeesImpl.setWork_phonenumber(StringPool.BLANK);
        } else {
            employeesImpl.setWork_phonenumber(work_phonenumber);
        }

        if (mobile_phonenumber == null) {
            employeesImpl.setMobile_phonenumber(StringPool.BLANK);
        } else {
            employeesImpl.setMobile_phonenumber(mobile_phonenumber);
        }

        employeesImpl.setBank_id(bank_id);
        employeesImpl.setArchive_status(archive_status);

        employeesImpl.resetOriginalValues();

        return employeesImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employee_id = objectInput.readLong();
        lastname = objectInput.readUTF();
        firstname = objectInput.readUTF();
        middlename = objectInput.readUTF();
        gender = objectInput.readUTF();
        date_of_birth = objectInput.readUTF();
        date_of_employment = objectInput.readUTF();
        position_id = objectInput.readLong();
        salary = objectInput.readLong();
        work_phonenumber = objectInput.readUTF();
        mobile_phonenumber = objectInput.readUTF();
        bank_id = objectInput.readLong();
        archive_status = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employee_id);

        if (lastname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastname);
        }

        if (firstname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstname);
        }

        if (middlename == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(middlename);
        }

        if (gender == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gender);
        }

        if (date_of_birth == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(date_of_birth);
        }

        if (date_of_employment == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(date_of_employment);
        }

        objectOutput.writeLong(position_id);
        objectOutput.writeLong(salary);

        if (work_phonenumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(work_phonenumber);
        }

        if (mobile_phonenumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(mobile_phonenumber);
        }

        objectOutput.writeLong(bank_id);
        objectOutput.writeBoolean(archive_status);
    }
}
