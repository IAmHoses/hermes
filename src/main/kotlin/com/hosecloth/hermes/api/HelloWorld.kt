package com.hosecloth.hermes.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {
    @GetMapping("/rest/hello-world")
    fun helloWorld(): String {
        return "hello world :D"
    }
}