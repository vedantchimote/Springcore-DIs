package tech.vedantchimote.componentscan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"tech.vedantchimote.componentscan.writer",
                               "tech.vedantchimote.componentscan.service"})
public class Config {


}
