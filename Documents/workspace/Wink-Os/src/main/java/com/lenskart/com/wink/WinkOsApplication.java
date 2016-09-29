package com.lenskart.com.wink;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Author : Dinesh
 *
 */
@EnableJSONDoc
@EnableAutoConfiguration
@ComponentScan
//@EnableEurekaClient
@EnableOAuth2Resource
@EnableTransactionManagement(proxyTargetClass = true)
public class WinkOsApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(WinkOsApplication.class, args);
    }
}
