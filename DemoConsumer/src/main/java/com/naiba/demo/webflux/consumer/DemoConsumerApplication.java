package com.naiba.demo.webflux.consumer;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * DemoConsumerApplication
 *
 * @author John Chen
 * @since 2021/4/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoConsumerApplication.class).web(WebApplicationType.REACTIVE).run(args);
    }
}
