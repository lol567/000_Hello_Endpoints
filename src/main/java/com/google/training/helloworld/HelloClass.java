package com.google.training.helloworld;

public class HelloClass {
    private String message = "Hello World"; 

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }

    public HelloClass(String name, String period) {
		this.message = "Hello " + name + " with period of " + period + '!';
	}

	public String getMessage() {
        return message;
    }
}
