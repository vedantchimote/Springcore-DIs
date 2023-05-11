package tech.vedantchimote.componentscan.driver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.vedantchimote.componentscan.config.Config;
import tech.vedantchimote.componentscan.writer.PrintWriter;
public class Main {
    public static void main(String[] args) {

        //Here we will be using the compnent scan instead of using the @Configuration annotation

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        PrintWriter printWriter = applicationContext.getBean(PrintWriter.class);
        printWriter.write("printing through the service");

        applicationContext.close();

    }
}