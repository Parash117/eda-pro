package com.pgrg.pms.test;

import com.pgrg.pms.config.feign.DiscoveryFeignClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DiscoveryFeignClientConfig doDiscoveryFeignClientConfig;

    @GetMapping("/get2")
    public String get2() {
        return doDiscoveryFeignClientConfig.HelloWorld();
    }

}
