package tech.vedantchimote.xmlconfiguration.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.vedantchimote.xmlconfiguration.writer.PrintWriter;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        PrintWriter printWriter = applicationContext.getBean( "printWriter",PrintWriter.class);
        printWriter.write("printing through the service");

    }
}