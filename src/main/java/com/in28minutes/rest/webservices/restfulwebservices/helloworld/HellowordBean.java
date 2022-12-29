package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HellowordBean {
    private String message;

    public HellowordBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HellowordBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
