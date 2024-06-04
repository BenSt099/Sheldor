package org.sheldor.fileHandler;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {

    public static File handle_args(String[] arguments) {
        if(arguments.length != 1) {
            throw new IllegalArgumentException("[ERROR]: Only one argument is allowed.");
        }
        return new File(Paths.get(arguments[0]).toString());
    }
}