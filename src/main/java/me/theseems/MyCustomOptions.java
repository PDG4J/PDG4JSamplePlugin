package me.theseems;

import picocli.CommandLine;

public class MyCustomOptions {
    @CommandLine.Option(names = "myString", defaultValue = "Sample")
    private String myString;

    public String getMyString() {
        return myString;
    }
}
