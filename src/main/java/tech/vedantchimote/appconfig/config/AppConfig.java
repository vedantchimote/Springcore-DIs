package tech.vedantchimote.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.vedantchimote.service.ComplexMessageService;
import tech.vedantchimote.service.MessageService;
import tech.vedantchimote.service.SimpleMessageService;
import tech.vedantchimote.writer.PrintWriter;

@Configuration
public class AppConfig {

    @Bean
    public MessageService getSimpleMessageService() {
        return new SimpleMessageService();
    }
    @Bean
    public MessageService getComplexMessageService() {
        return new ComplexMessageService();
    }
    @Bean
    public PrintWriter getPrintWriter() {
        return new PrintWriter(getComplexMessageService());
    }
}
