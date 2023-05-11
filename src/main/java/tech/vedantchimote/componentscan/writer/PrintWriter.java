package tech.vedantchimote.componentscan.writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tech.vedantchimote.componentscan.service.MessageService;

@Component
public class PrintWriter {

    //this is a dummy clas which is responsible for writing stuff from Message Service
    private final MessageService messageService;

    @Autowired
    public PrintWriter(@Qualifier("complexMessageService") MessageService messageService) {
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
