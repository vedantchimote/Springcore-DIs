package tech.vedantchimote.appconfig.service;

import org.springframework.stereotype.Service;

@Service
public class ComplexMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
