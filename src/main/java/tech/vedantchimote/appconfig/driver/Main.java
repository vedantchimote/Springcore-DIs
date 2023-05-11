package tech.vedantchimote.appconfig.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.vedantchimote.appconfig.config.AppConfig;
import tech.vedantchimote.appconfig.writer.PrintWriter;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        PrintWriter printWriter = applicationContext.getBean( PrintWriter.class);
        printWriter.write("Chalo ab yeh bhi print kar lo");

    }
}