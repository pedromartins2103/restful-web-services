package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class Helloworld {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HellowordBean helloWorldBean() {
        return new HellowordBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HellowordBean helloWorldPathVariable(@PathVariable String name) {
        return new HellowordBean(String.format("HelloWorld %s", name));
    }

}
