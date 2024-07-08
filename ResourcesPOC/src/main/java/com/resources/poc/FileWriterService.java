package com.resources.poc;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterService {
    public void writeToFileSystem(String path, String data) throws IOException {
        FileWriter writer = new FileWriter(path, true); 
        writer.write(data + "\n"); 
        writer.close();
    }

}
