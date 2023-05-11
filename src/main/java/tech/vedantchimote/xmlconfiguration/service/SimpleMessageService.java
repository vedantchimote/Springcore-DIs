package tech.vedantchimote.xmlconfiguration.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {

        System.out.println(message);

    }
}
