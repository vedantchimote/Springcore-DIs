package tech.vedantchimote.appconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.vedantchimote.appconfig.service.ComplexMessageService;
import tech.vedantchimote.appconfig.service.MessageService;
import tech.vedantchimote.appconfig.service.SimpleMessageService;
import tech.vedantchimote.appconfig.writer.PrintWriter;

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
