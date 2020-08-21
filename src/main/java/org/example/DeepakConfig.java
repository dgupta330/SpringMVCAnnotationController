package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"org.example"})
public class DeepakConfig  {
    @Bean
    public InternalResourceViewResolver viewResolver()
    {
        InternalResourceViewResolver vr=new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/");
        vr.setSuffix(".jsp");

        return vr;
    }

}
