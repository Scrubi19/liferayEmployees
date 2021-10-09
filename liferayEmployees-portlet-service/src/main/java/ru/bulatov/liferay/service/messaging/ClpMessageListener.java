package ru.bulatov.liferay.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import ru.bulatov.liferay.service.ClpSerializer;
import ru.bulatov.liferay.service.banksLocalServiceUtil;
import ru.bulatov.liferay.service.employeesLocalServiceUtil;
import ru.bulatov.liferay.service.positionsLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            banksLocalServiceUtil.clearService();

            employeesLocalServiceUtil.clearService();

            positionsLocalServiceUtil.clearService();
        }
    }
}
