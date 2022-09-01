package com.pgrg.pms.config.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class DiscoveryFeignClientConfig {

    @Autowired
    private TheClient theClient;

    @FeignClient(name = "bill-ms")
    interface TheClient {

        @RequestMapping(path = "/test/get", method = RequestMethod.GET)
        @ResponseBody
        String helloWorld();
    }

    public String HelloWorld() {
        return theClient.helloWorld();
    }

}
