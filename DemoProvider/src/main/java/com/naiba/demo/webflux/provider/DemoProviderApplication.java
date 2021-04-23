package com.naiba.demo.webflux.provider;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * DemoProviderApplication
 *
 * @author John Chen
 * @since 2021/4/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoProviderApplication.class).web(WebApplicationType.REACTIVE).run(args);
    }
}
