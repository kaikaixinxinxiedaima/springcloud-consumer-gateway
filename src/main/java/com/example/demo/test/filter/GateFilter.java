package com.example.demo.test.filter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GateFilter {

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("服务不可用");
    }
}
