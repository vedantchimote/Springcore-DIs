package tech.vedantchimote.componentscan.service;

import org.springframework.stereotype.Service;

@Service("simpleMessageService")
public class SimpleMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {

        System.out.println(message);

    }
}
