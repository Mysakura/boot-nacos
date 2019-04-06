package com.example.demo.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.stereotype.Component;


@Component
@NacosPropertySource(dataId = "database",groupId = "DEFAULT_GROUP",autoRefreshed = true)
public class DatabaseConfig {

    @NacosValue(value = "${driver_class_name}", autoRefreshed = true)
    private String driverClassName;

    @NacosValue(value = "${url}", autoRefreshed = true)
    private String url;

    @NacosValue(value = "${user_name}", autoRefreshed = true)
    private String username;

    @NacosValue(value = "${password}", autoRefreshed = true)
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
