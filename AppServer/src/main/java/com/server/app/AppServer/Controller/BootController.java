package com.server.app.AppServer.Controller;

import com.server.app.AppServer.DTO.ReqData;
import com.server.app.AppServer.DTO.User;
import com.server.app.AppServer.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/fshServer")
public class BootController {

    private static final Logger LOGGER = Logger.getLogger(BootController.class.getName());

    @Autowired
    MainService mainService;

    // SENDER
    @PostMapping(value = "/reqReceiver", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> reqReceiver(@RequestBody ReqData reqData) {
        LOGGER.info("Invoked EndPoint : '/reqReceiver'");
        return mainService.reqReceiver(reqData);
    }

    // RECEIVER
    @PostMapping(value = "/reqSender", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> reqSender(@RequestBody ReqData reqData) {
        LOGGER.info("Invoked EndPoint : '/reqSender'");
        return mainService.reqSender(reqData);
    }

    // DISCONNECT
    @PostMapping(value = "/disconnect", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> disconnect(User user) {
        LOGGER.info("Invoked EndPoint : '/disconnect'");
        // TODO: Implement disconnect method
        return mainService.disconnect(user);
    }
}
