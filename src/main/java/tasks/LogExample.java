package tasks;

import lombok.extern.java.Log;

import java.util.logging.Level;
import java.util.logging.LogRecord;

@Log
public class LogExample {
    private static void someFunction(){
        log.severe( "some function");
    }

    public static void run(){
        someFunction();
    }
}
