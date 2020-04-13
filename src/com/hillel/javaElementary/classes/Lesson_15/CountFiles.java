package com.hillel.javaElementary.classes.Lesson_15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class CountFiles {

    public static int countFiles(File file){
        int result = 0;
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++){
            if (files[i].isFile()){
                result++;
            }else {
                result += countFiles(files[i]);
            }
        }


        return result;
    }
}
