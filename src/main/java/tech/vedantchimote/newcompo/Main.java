package tech.vedantchimote.newcompo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MyController controller = context.getBean(MyController.class);
        controller.handleRequest();

        context.close();
    }
}
