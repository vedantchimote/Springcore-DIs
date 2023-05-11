package tech.vedantchimote.xmlconfiguration.writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.vedantchimote.xmlconfiguration.service.MessageService;

@Component
public class PrintWriter {

    //this is a dummy clas which is responsible for writing stuff from Message Service
    private MessageService messageService;

    @Autowired
    public PrintWriter( MessageService messageService) {
        System.out.println("The constructor injection is adopted");
        this.messageService = messageService;
    }

//    @Autowired
//    public void setMessageService(MessageService messageService) {
//        System.out.println("The setter injection is adopted");
//        this.messageService = messageService;
//    }

    public void write(String message) {
        messageService.sendMessage(message);
    }

}
