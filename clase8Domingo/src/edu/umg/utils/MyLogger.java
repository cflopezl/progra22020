package edu.umg.utils;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class MyLogger {
    private static Logger instance;

    private MyLogger(){}

    public static Logger getInstance() {
        try {
            if (instance == null) {
                instance = Logger.getLogger(MyLogger.class.getName());
                FileHandler fh = new FileHandler(VariablesGlobales.fileName, true);
                instance.addHandler(fh);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return instance;
    }
}
