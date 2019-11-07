package ru.itpark.service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Part;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileService {
    private final String uploadPath;

    public FileService() throws IOException {
        uploadPath =System.getenv("UPLOAD_PATH");
        Files.createDirectories(Paths.get(uploadPath));
    }
    public void readFile(String id, ServletOutputStream os) throws IOException {
        var path=Paths.get(uploadPath).resolve(id);
        Files.copy(path,os);
    }
    public void writeFile(String id, Part part) throws IOException {
        part.write(Paths.get(uploadPath).resolve(id).toString());
    }
}