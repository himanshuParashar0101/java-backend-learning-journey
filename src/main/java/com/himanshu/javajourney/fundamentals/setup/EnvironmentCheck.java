package com.himanshu.javajourney.fundamentals.setup;

public class EnvironmentCheck {

    public static void main(String[] args) {
        System.out.println("Java runtime: "
                + System.getProperty("java.runtime.version"));

        System.out.println("Java vendor: "
                + System.getProperty("java.vendor"));

        System.out.println("Operating system: "
                + System.getProperty("os.name"));

        System.out.println("Architecture: "
                + System.getProperty("os.arch"));

        System.out.println("Available processors: "
                + Runtime.getRuntime().availableProcessors());

        System.out.println("Maximum JVM memory: "
                + Runtime.getRuntime().maxMemory());
    }
}