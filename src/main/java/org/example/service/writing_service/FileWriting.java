package org.example.service.writing_service;

import org.example.service.getting_file_name.GettingFileName;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Class contains static void method "writeToFile" - method to write the contents of a line tag to a file.
 */
public class FileWriting {
    public static void writeToFile(String line) {
        try {
            String fileName = GettingFileName.getFileName();

            FileWriter writer = new FileWriter(fileName, true);
            writer.write(line + "\n");
            writer.close();

            System.out.println("Line \"" + line + "\" written to file: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
