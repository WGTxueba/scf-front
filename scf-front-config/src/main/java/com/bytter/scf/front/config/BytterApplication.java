package com.bytter.scf.front.config;

import com.baomidou.mybatisplus.plugins.Page;
import com.bytter.scf.core.json.MybatisPlusPageJsonSerializer;
import com.bytter.scf.security.config.DataCenterConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication(scanBasePackages = {"com.bytter.scf.**"})
@EnableFeignClients(basePackages = {"com.bytter.scf.**.client.**"}, defaultConfiguration = {DataCenterConfiguration.class})
public class BytterApplication {

    @Bean
    public Jackson2ObjectMapperBuilder jacksonBuilder() {
        Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder = new Jackson2ObjectMapperBuilder();
        jackson2ObjectMapperBuilder.failOnUnknownProperties(false);
        jackson2ObjectMapperBuilder.serializationInclusion(JsonInclude.Include.NON_EMPTY);
        jackson2ObjectMapperBuilder.serializerByType(Page.class, new MybatisPlusPageJsonSerializer());
        return jackson2ObjectMapperBuilder;
    }
}
