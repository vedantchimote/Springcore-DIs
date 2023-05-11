package tech.vedantchimote.componentscan.service;

import org.springframework.stereotype.Service;

@Service("complexMessageService")
public class ComplexMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

}
