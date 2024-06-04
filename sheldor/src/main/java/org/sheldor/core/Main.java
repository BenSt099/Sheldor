package org.sheldor.core;

import org.sheldor.fileHandler.FileHandler;
import org.sheldor.parser.ParseTestFiles;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File test_files = FileHandler.handle_args(args);
        ParseTestFiles.parse_test_files(test_files);

    }


}