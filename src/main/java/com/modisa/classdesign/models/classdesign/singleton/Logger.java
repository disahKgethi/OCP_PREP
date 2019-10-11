package com.modisa.classdesign.models.classdesign.singleton;

public class Logger {
    private Logger(){}

    private static Logger logInstance;

    public static Logger getInstance() {
        if (logInstance == null) {
            logInstance = new Logger();
        }
        return logInstance;
    }

    public void log(String s) {
        System.err.println(s);
    }
}
