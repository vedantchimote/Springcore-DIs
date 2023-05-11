package tech.vedantchimote.componentscanexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {
    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void handleRequest() {
        myService.doSomething();
    }
}
