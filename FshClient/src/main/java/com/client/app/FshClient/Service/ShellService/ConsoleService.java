package com.client.app.FshClient.Service.ShellService;

import com.client.app.FshClient.Util.UserType;
import org.jline.utils.AttributedString;
import org.springframework.stereotype.Service;

@Service
public interface ConsoleService {
    void write(AttributedString msg);
    void write(String msg, boolean isAck);
    void writeACK(String msg);
    void writeNACK(String msg);
    void writeInfo(String msg);
    void updateByConnectionEvent(UserType userType, boolean connectionStatus);
}
